package kyu_6.street_fighter_2_character_selection.java;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
        List<String> result = new ArrayList<>();
        for (String move : moves) {
            switch (move) {
                case "up" -> {
                    try {
                        position[0] -= 1;
                        result.add(fighters[position[0]][position[1]]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        position[0] += 1;
                        result.add(fighters[position[0]][position[1]]);
                    }
                }
                case "left" -> {
                    try {
                        position[1] -= 1;
                        result.add(fighters[position[0]][position[1]]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        position[1] = fighters[0].length - 1;
                        result.add(fighters[position[0]][position[1]]);
                    }
                }
                case "right" -> {
                    try {
                        position[1] += 1;
                        result.add(fighters[position[0]][position[1]]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        position[1] = 0;
                        result.add(fighters[position[0]][position[1]]);
                    }
                }
                case "down" -> {
                    try {
                        position[0] += 1;
                        result.add(fighters[position[0]][position[1]]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        position[0] -= 1;
                        result.add(fighters[position[0]][position[1]]);
                    }
                }
            }
        }
        return result.toArray(new String[0]);
    }
}