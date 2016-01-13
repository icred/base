package eu.icred.plugin;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.swing.JOptionPane;

public class PluginInstaller {
    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) throws IOException {

        File myselfJarFile = new File(PluginInstaller.class.getProtectionDomain().getCodeSource().getLocation().getFile());
        File icredBaseDir = myselfJarFile.getParentFile().getParentFile();
        File icredLibDir = new File(icredBaseDir, "libs");

        if (!icredLibDir.exists()) {
            JOptionPane.showMessageDialog(null, "lib dir of icred not found!\r\ndir=" + icredLibDir, "error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        ZipInputStream zipStream = new ZipInputStream(new FileInputStream(myselfJarFile), Charset.forName("UTF-8"));
        try {
            ZipEntry entry;
            while ((entry = zipStream.getNextEntry()) != null) {
                if (!entry.isDirectory()) {
                    String entryName = entry.getName();

                    if (entryName.startsWith("libs/")) {
                        extractLib(zipStream, new File(icredLibDir, entryName.substring(entryName.lastIndexOf("/") + 1)));
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "\r\n", "Exception", JOptionPane.ERROR_MESSAGE);
        } finally {
            zipStream.close();
        }
        
        JOptionPane.showMessageDialog(null, "installation completed", "success", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void extractLib(ZipInputStream zipStream, File libTargetFile) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(libTargetFile));
        byte[] bytesIn = new byte[BUFFER_SIZE];
        int read = 0;
        while ((read = zipStream.read(bytesIn)) != -1) {
            bos.write(bytesIn, 0, read);
        }
        bos.close();
    }
}
