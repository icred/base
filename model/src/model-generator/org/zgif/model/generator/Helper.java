/**
 * 
 */
package org.zgif.model.generator;

import java.io.File;

/**
 * @author Pascal Houdek
 *
 */
public abstract class Helper {
    public static File traversalFile(File base, String... nodes) {
        File curFile = base;
        for (String curNode : nodes) {
            if (curNode.equals("..")) {
                curFile = curFile.getParentFile();
            } else if (curNode.equals(".")) {
                // nothing to do
            } else {
                curFile = new File(curFile, curNode);
            }

        }
        return curFile;
    }
    
    public static void delete(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    delete(files[i]);
                }
            } else {
                file.delete();
            }
        }
    }
}
