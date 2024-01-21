package StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles_07 {
    public static void main(String[] args) throws IOException {

        String pathFileOne = "D:\\SOFTUNI_JAVA_ADVANCED_JANUARY_2024\\Documentation\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String pathFileTwo = "D:\\SOFTUNI_JAVA_ADVANCED_JANUARY_2024\\Documentation\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        PrintWriter writer = new PrintWriter("D:\\SOFTUNI_JAVA_ADVANCED_JANUARY_2024\\Documentation\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\outputMerge.txt");

        List<String> allLinesFileOne = Files.readAllLines(Path.of(pathFileOne));
        allLinesFileOne.forEach(writer::println);
        List<String> allLinesFileTwo = Files.readAllLines(Path.of(pathFileTwo)); //всички редове от файл 2
        allLinesFileTwo.forEach(writer::println);

        writer.close();

    }
}