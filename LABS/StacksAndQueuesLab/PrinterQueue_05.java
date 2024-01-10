package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque <String> queue = new ArrayDeque<>();

        String file = scanner.nextLine();

        while (!file.equals("print")){
            if (!file.equals("cancel")){
                queue.offer(file);
            } else if (queue.isEmpty()) {
                System.out.println("Printer is on standby");
            } else {
                System.out.println("Canceled " + queue.pollFirst());
            }
            file = scanner.nextLine();
        }
        for (String el : queue){
            System.out.println(el);
        }
    }
}
