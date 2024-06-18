package kyu_6.prize_draw.java;

import java.util.HashMap;
import java.util.Map;

class Rank {

    public static String nthRank(String st, Integer[] we, int n) {
        if (st.isEmpty()) {
            return "No participants";
        } else if(n > we.length) {
            return "Not enough participants";
        }
        String[] names = st.split(",");
        Map<String, Integer> ranks = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int weight = we[i];
            int rank = (name.length() + name.chars().map(c -> Character.toLowerCase(c) - 'a' + 1).sum()) * weight;
            ranks.put(name, rank);
        }
        return ranks.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .map(Map.Entry::getKey)
                .toArray(String[]::new)[n - 1];
    }
}