package StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers_05 {
    public static void main(String[] args) throws IOException {

        String path = "D:\\SOFTUNI_JAVA_ADVANCED_JANUARY_2024\\Documentation\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";

        List<String> allLines = Files.readAllLines(Path.of(path));

        PrintWriter writer = new PrintWriter("D:\\SOFTUNI_JAVA_ADVANCED_JANUARY_2024\\Documentation\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output_line_numbers.txt");
        int lineNumber = 1;
        for (String line : allLines) {
            writer.println(lineNumber + ". " + line);
            lineNumber++;
        }
        writer.close();
    }
}