package eu.icred.plugin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.zip.ZipFile;

import org.apache.log4j.Logger;

import eu.icred.Paths;
import eu.icred.plugin.worker.input.IImportWorker;
import eu.icred.plugin.worker.output.IExportWorker;

/**
 * @author Pascal Houdek
 * 
 */
public class PluginLoader {
    private static Map<String, IPlugin> availablePlugins;
    private static Logger   logger       = Logger.getLogger(PluginLoader.class);

    static {
        availablePlugins = new HashMap<String, IPlugin>();

        logger.debug("load plugins from dev-config.prop");
        Properties props = Paths.getProperties();
        String[] registeredPlugins = {};
        if (props != null) {
            registeredPlugins = props.getProperty("registeredPlugins", "").trim().split(",");
        }
        
        logger.trace(Arrays.asList(registeredPlugins));
        
        for (String registeredPlugin : registeredPlugins) {
            try {
                Class<IPlugin> pluginClass = (Class<IPlugin>) Class.forName(registeredPlugin);

                IPlugin plugin = pluginClass.newInstance();
                String pluginId = plugin.getPluginId();

                logger.debug("loaded plugin: " + pluginId);
                availablePlugins.put(pluginId, plugin);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                logger.warn("unable to load plugin: " + registeredPlugin, e);
            }
        }
        logger.debug("loaded plugins: " + availablePlugins.keySet());

        logger.debug("load plugins from jar");
        File[] pluginJars = Paths.getPluginDir().listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".jar");
            }
        });

        if (pluginJars != null) {
            for (File pluginJar : pluginJars) {
                ZipFile pluginZip = null;
                try {
                    pluginZip = new ZipFile(pluginJar);
                    InputStream manifestStream = pluginZip.getInputStream(pluginZip.getEntry("META-INF/MANIFEST.MF"));
                    BufferedReader br = new BufferedReader(new InputStreamReader(manifestStream));

                    String line;
                    while ((line = br.readLine()) != null) {
                        if (line.startsWith("PluginClass: ")) {
                            String pluginName = line.substring(12).trim();
                            
                            if (pluginName != null && pluginName.length() > 0) {
                                URLClassLoader loader = new URLClassLoader((URL[]) Arrays.asList(pluginJar.toURL()).toArray(),
                                        ClassLoader.getSystemClassLoader());
                                try {
                                    Class<IPlugin> pluginClass = (Class<IPlugin>) Class.forName(pluginName, false, loader);

                                    IPlugin plugin = pluginClass.newInstance();
                                    String pluginId = plugin.getPluginId();

                                    logger.debug("loaded plugin: " + pluginId);
                                    availablePlugins.put(pluginId, plugin);
                                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }

                } catch (IOException e) {
                    logger.warn("unable to load plugin", e);
                } finally {
                    try {
                        pluginZip.close();
                    } catch (Throwable e) {
                    }
                }
            }
        }
        logger.debug("loaded plugins: " + availablePlugins.keySet());
    }

    public static Collection<IPlugin> getAvailablePlugins() {
        return availablePlugins.values();
    }

    public static IPlugin getPlugin(String pluginId) {
        return availablePlugins.get(pluginId);
    }

    public static IImportWorker getImportPlugin(String pluginId) {
        IPlugin plugin = getPlugin(pluginId);
        if (plugin != null) {
            return plugin.getImportPlugin();
        }
        return null;
    }

    public static IExportWorker getExportPlugin(String pluginId) {
        IPlugin plugin = getPlugin(pluginId);
        if (plugin != null) {
            return plugin.getExportPlugin();
        }
        return null;
    }
}
