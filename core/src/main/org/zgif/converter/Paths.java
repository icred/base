/**
 * 
 */
package org.zgif.converter;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Pascal Houdek
 * 
 */
public class Paths {
	public static File getPluginDir() {
		return new File(new File(System.getProperty("user.dir")), "plugins");
	}

	public static File findFile(String fileName) {
		File userHome = new File(System.getProperty("user.home"));
		if (new File(userHome, fileName).exists()) {
			return new File(userHome, fileName);
		}

		File workingDir = new File(System.getProperty("user.dir"));
		if (new File(workingDir, fileName).exists()) {
			return new File(workingDir, fileName);
		}

		return null;
	}

	public static Properties getProperties() {
		Properties properties = null;

		File propFile = findFile("dev-config.prop");
		if (propFile != null) {
			properties = new Properties();
			BufferedInputStream stream = null;
			try {
				stream = new BufferedInputStream(new FileInputStream(propFile));
				properties.load(stream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					stream.close();
				} catch (Throwable t) {
				}
			}
		}

		return properties;
	}
}
