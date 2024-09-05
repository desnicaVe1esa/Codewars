package kyu_5.pete_the_baker.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PeteBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        List<Integer> productCount = new ArrayList<>();
        for (Map.Entry<String, Integer> item : available.entrySet()) {
            int divider = recipe.getOrDefault(item.getKey(), 0);
            if (divider > 0) {
                productCount.add(item.getValue() / divider);
            }
        }
        return productCount.size() < recipe.size() ? 0 :
                productCount.stream().mapToInt(v -> v).min().getAsInt();
    }
}
