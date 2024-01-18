package SetsAndMapsAdvancedExercises;

import java.util.*;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        TreeMap<Character,Integer> map = new TreeMap<>();

        for(int i = 0 ;i < line.length();i++){
            char current = line.charAt(i);
            if(!map.containsKey(current)){
                map.put(current,0);
            }

            map.put(current,map.get(current)+1);
        }
        map.entrySet().stream().forEach(ch -> {
            System.out.format("%s: %d time/s\n",ch.getKey(),ch.getValue());
        });
    }
}