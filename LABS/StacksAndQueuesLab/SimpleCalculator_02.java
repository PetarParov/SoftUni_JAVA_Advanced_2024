package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque <String> stack = new ArrayDeque<>();

        String[] tokens = scanner.nextLine().split("\\s+");
        Collections.addAll(stack, tokens);

        while (stack.size() > 1) {
            int first = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int second = Integer.parseInt(stack.pop());
            switch (op) {
                case "+":
                    stack.push(String.valueOf(first + second));
                    break;
                case "-":
                    stack.push(String.valueOf(first - second));
                    break;
            }
        }
        System.out.println(stack.pop());
    }
}
