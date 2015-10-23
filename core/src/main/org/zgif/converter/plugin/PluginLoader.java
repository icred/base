package org.zgif.converter.plugin;

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
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.zip.ZipFile;

import org.zgif.converter.Paths;
import org.zgif.converter.plugin.input.IImportPlugin;
import org.zgif.converter.plugin.output.IExportPlugin;

/**
 * @author Pascal Houdek
 * 
 */
public class PluginLoader {
    private static Map<String, IPluginWrapper> availablePlugins;

    static {
        availablePlugins = new HashMap<String, IPluginWrapper>();

        Properties props = Paths.getProperties();
        String[] registeredPlugins = {};
        if (props != null) {
            registeredPlugins = props.getProperty("registeredPlugins", "").trim().split(",");
        }

        for (String registeredPlugin : registeredPlugins) {
            try {
                Class<IPluginWrapper> pluginClass = (Class<IPluginWrapper>) Class.forName(registeredPlugin);

                IPluginWrapper plugin = pluginClass.newInstance();
                String pluginId = plugin.getPluginId();

                availablePlugins.put(pluginId, plugin);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                throw new Error("unable to load plugin: " + registeredPlugin, e);
            }
        }

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
                                    Class<IPluginWrapper> pluginClass = (Class<IPluginWrapper>) Class.forName(pluginName, false, loader);

                                    IPluginWrapper plugin = pluginClass.newInstance();
                                    String pluginId = plugin.getPluginId();
                                    
                                    availablePlugins.put(pluginId, plugin);
                                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        pluginZip.close();
                    } catch (Throwable e) {
                    }
                }
            }
        }
    }

    public static Collection<IPluginWrapper> getAvailablePlugins() {
        return availablePlugins.values();
    }

    public static IPluginWrapper getPlugin(String pluginId) {
        return availablePlugins.get(pluginId);
    }

    public static IImportPlugin getImportPlugin(String pluginId) {
        IPluginWrapper plugin = getPlugin(pluginId);
        if (plugin != null) {
            return plugin.getImportPlugin();
        }
        return null;
    }

    public static IExportPlugin getExportPlugin(String pluginId) {
        IPluginWrapper plugin = getPlugin(pluginId);
        if (plugin != null) {
            return plugin.getExportPlugin();
        }
        return null;
    }
}
