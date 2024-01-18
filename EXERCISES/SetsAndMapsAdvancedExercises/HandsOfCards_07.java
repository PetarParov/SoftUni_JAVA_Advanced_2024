package SetsAndMapsAdvancedExercises;

import java.util.*;

public class HandsOfCards_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, LinkedHashMap<String, Integer>> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String[] arguments = input.split(": ");
            String name = arguments[0].replace(":", "");
            String[] cards = arguments[1].split(", ");

            for (int i = 0; i < cards.length; i++) {
                players.putIfAbsent(name, new LinkedHashMap<>());
                players.get(name).putIfAbsent(cards[i], 0);
                int value = 0;

                switch (cards[i].substring(0, cards[i].length() - 1)) {
                    case "J":
                        value = 11;
                        break;
                    case "Q":
                        value = 12;
                        break;
                    case "K":
                        value = 13;
                        break;
                    case "A":
                        value = 14;
                        break;
                    default:
                        value = (Integer.parseInt(cards[i].substring(0, cards[i].length() - 1)));
                }

                switch (cards[i].substring(cards[i].length() - 1, cards[i].length())) {
                    case "C":
                        value *= 1;
                        break;
                    case "H":
                        value *= 3;
                        break;
                    case "S":
                        value *= 4;
                        break;
                    case "D":
                        value *= 2;
                        break;
                }
                players.get(name).put(cards[i], value);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> player : players.entrySet()) {
            System.out.printf(player.getKey() + ": ");
            int sum = 0;
            for (int x : player.getValue().values()) {
                sum += x;
            }
            System.out.println(sum);
        }

    }
}