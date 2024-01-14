package kyu_6.who_like_this;

import java.util.ArrayList;
import java.util.List;

// Создает лайки
public class Solution {
    public static String whoLikesIt(String... names) {
        List<String> strings = new ArrayList<>(List.of(names));
        switch (names.length) {
            case 0 -> {
                return "no one likes this";
            }
            case 2 -> {
                return String.join(" and ", names).concat(" like this");
            }
            case 3 -> {
                return strings.get(0).concat(", ").concat(strings.get(1)).concat(" and ").concat(strings.get(2)).concat(" like this");
            }
        }
        if (names.length > 3) {
            String count = String.format("%s others", names.length - 2);
            return strings.get(0).concat(", ").concat(strings.get(1)).concat(" and ").concat(count).concat(" like this");
        }
        return strings.get(0).concat(" likes this");
    }
}
