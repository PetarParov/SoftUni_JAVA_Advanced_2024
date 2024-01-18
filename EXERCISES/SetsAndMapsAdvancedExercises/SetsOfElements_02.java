package SetsAndMapsAdvancedExercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int N = tokens[0];
        int M = tokens [1];
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < N; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            firstSet.add(num1);
        }
        for (int i = 0; i < M; i++) {
            int num2 = Integer.parseInt(scanner.nextLine());
            secondSet.add(num2);
        }
        for (int element : firstSet){
            if(secondSet.contains(element)){
                System.out.print(element+ " ");
            }
        }
    }
}
