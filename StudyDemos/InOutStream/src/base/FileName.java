package base;

import java.io.File;

public class FileName {
    public static void main(String path) {

        File[] filesList;
        File filesPath = new java.io.File(path);
        filesList = filesPath.listFiles();

        for (int i = 0; i < filesList.length; i++) {
            String buf = filesList[i].getName();
            buf = new StringBuilder(buf).reverse().toString();
            if (buf.contains(".")) {
                String[] type = buf.split("\\.");
                type[0] = new StringBuilder(type[0]).reverse().toString();
                buf = type[1] + "." + type[0];
            }
            filesList[i].renameTo(new File(path + "\\" + buf));
        }
    }
}