package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();

        while (!line.equals("Home")){
         if (!line.equals("back")){
             stack.push(line);
             System.out.println(line);
         } else if (stack.size() > 1){
             stack.pop();
             System.out.println(stack.peek());
         } else {
             System.out.println("no previous URLs");
         }
            line =scanner.nextLine();
        }
    }
}
