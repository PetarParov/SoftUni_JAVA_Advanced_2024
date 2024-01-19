package StreamsFilesAndDirectoriesLab;

import java.io.File;

public class ListFiles_07 {
    public static void main(String[] args) {
        File folder = new File("D:\\SOFTUNI_JAVA_ADVANCED_JANUARY_2024\\Documentation\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        if (folder.exists()) {
            //съществува такъв файл
            if (folder.isDirectory()) {
                //файлър е папка
                File[] allFiles = folder.listFiles();
                for (File file : allFiles) {
                    if (!file.isDirectory()) {
                        System.out.printf("%s: [%d]%n", file.getName(), file.length());
                    }
                }
            }
        }
    }
}