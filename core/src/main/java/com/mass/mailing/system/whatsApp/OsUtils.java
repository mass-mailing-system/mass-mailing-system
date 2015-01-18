package com.mass.mailing.system.whatsApp;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

/**
 * @author Illia Rudenko
 * @author Oleg Kozak
 */

public class OsUtils {

    private static String OS = null;

    public static String getOsName() {
        if(OS == null) { OS = System.getProperty("os.name"); }
        return OS;
    }
    public static boolean isWindows() {
        return getOsName().startsWith("Windows");
    }

    public static boolean isUnix() {
        return getOsName().startsWith("Unix");
    }

    public static String runCommand(String command) throws IOException {

        StringWriter writer = new StringWriter();

        if(command != null) {
            Process p = Runtime.getRuntime().exec(command);
            IOUtils.copy(p.getInputStream(), writer, "UTF-8");
        }

        return writer.toString();
    }

    public static String runCommand(String command, String rootDirectoryName) throws IOException {

        StringWriter writer = new StringWriter();

        if(command != null) {
            Process p = Runtime.getRuntime().exec(command, null, new File(rootDirectoryName));
            IOUtils.copy(p.getInputStream(), writer, "UTF-8");
        }

        return writer.toString();
    }

}
