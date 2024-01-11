package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque <Integer> stack = new ArrayDeque<>();

        String numbers = scanner.nextLine();

        String [] nums = numbers.split("\\s+");

        for (String el : nums){
            stack.push(Integer.parseInt(el));
        }

        for (Integer number : stack){
            System.out.print(number + " ");
        }
    }
}
