package StreamsFilesAndDirectoriesExercises;

import java.awt.image.ImagingOpException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount_06 {
    public static void main(String[] args) throws ImagingOpException, IOException {

        String path = "D:\\SOFTUNI_JAVA_ADVANCED_JANUARY_2024\\Documentation\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";

        List<String> allLinesWithWords = Files.readAllLines(Path.of(path));

        Map<String, Integer> countWords = new HashMap<>();

        for (String line : allLinesWithWords){
            String [] wordsOnCurrentRow = line.split("\\s+");
            Arrays.stream(wordsOnCurrentRow).forEach(word -> {
                countWords.put(word, 0);
            });
        }

        String pathText = "D:\\SOFTUNI_JAVA_ADVANCED_JANUARY_2024\\Documentation\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        List<String> allLinesWithText = Files.readAllLines(Path.of(pathText));
        for (String line : allLinesWithText) {

            line = line.replaceAll("[.,?!:]", "");
            String [] words = line.split("\\s+"); //думите на съответния ред
            for (String word : words) {
                if (countWords.containsKey(word)) {
                    countWords.put(word, countWords.get(word) + 1);
                }
            }
        }

        PrintWriter writer = new PrintWriter("D:\\SOFTUNI_JAVA_ADVANCED_JANUARY_2024\\Documentation\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\result.txt");
        countWords.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));
        writer.close();

    }
}