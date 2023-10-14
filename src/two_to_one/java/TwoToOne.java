package two_to_one.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        char[] arr = (s1 + s2).toCharArray();
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            set.add(c);
        }
        sb.append(Arrays.stream(set.stream().sorted().toArray()).map(Object::toString).collect(Collectors.toList()));
        return sb.toString().replace(",", "").replace("[", "").replace("]", "").replace(" ", "").trim();
    }
}
