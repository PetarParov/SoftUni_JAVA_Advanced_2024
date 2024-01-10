package StacksAndQueuesLab;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String players = scanner.nextLine();
        String[] children = players.split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> queue = new PriorityQueue<>();

        for (String child : children) {
            queue.offer(child);
        }

        int cycle = 1;

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            if (IsPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }

        System.out.println("Last is " + queue.poll());
    }

    private static boolean IsPrime(int cycle) {
        if (cycle <= 1) {
            return false;
        }
        for (int i = 2; i <= cycle / 2; i++) {
            if ((cycle % i) == 0)
                return false;
        }
        return true;
    }
}



