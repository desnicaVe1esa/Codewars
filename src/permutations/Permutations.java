package permutations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Выводит строку во всех возможных комбинациях

public class Permutations {

    public static List<String> singlePermutations(String s) {
        List<String> result = new ArrayList<>();
        permute(0, new StringBuilder(s), result);
        return result
                .stream()
                .distinct()
                .collect(Collectors.toList());
    }

    private static void permute(int l, StringBuilder sb, List<String> result) {
        if (l == sb.length()) {
            result.add(sb.toString());
        } else {
            for (int i = l; i < sb.length(); i++) {
                swap(sb, i, l);
                permute(l + 1, new StringBuilder(sb), result);
                swap(sb, i, l);
            }
        }
    }

    private static void swap(StringBuilder sb, int i, int j) {
        char t = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, t);
    }
}
