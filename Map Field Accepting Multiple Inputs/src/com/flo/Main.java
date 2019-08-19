package com.flo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You vanished from the map"));
        locations.put(1, new Location(1, "You are standing in front of a small log house near a cliffsot"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside an abandoned, crumbling factory"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        Map <String, String> validVocab = new HashMap<String, String>();
        validVocab.put("QUIT","Q");
        validVocab.put("NORTH","N");
        validVocab.put("SOUTH","S");
        validVocab.put("WEST","W");
        validVocab.put("EAST","E");

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available routes are ");
            for(String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1) {
                String[] input = direction.split(" ");
                for (String word : input) {
                    if (validVocab.containsKey(word)) {
                        direction = validVocab.get(word);
                        break;
                    }
                }
            }
            if(exits.containsKey(direction)) {
                loc = exits.get(direction);

            } else {
                System.out.println("This path seems to be blocked");
            }
        }
    }
}
