package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                int startIndex = stack.pop();
                String contents = line.substring(startIndex, i + 1);
                System.out.println(contents);
            }
        }
    }
}
