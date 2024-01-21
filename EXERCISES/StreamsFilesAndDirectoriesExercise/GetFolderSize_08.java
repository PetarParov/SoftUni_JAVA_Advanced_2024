package StreamsFilesAndDirectoriesExercises;

import java.io.File;
import java.io.IOException;

public class GetFolderSize_08 {
    public static void main(String[] args) throws IOException {

        String path = "D:\\SOFTUNI_JAVA_ADVANCED_JANUARY_2024\\Documentation\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File folder = new File(path);

        File[] allFilesInFolder = folder.listFiles();

        int folderSize = 0;
        if (allFilesInFolder != null) {
            for (File file : allFilesInFolder) {
                folderSize += (int) file.length();
            }
        }

        System.out.println("Folder size: " + folderSize);
    }
}