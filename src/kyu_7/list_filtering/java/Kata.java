package kyu_7.list_filtering.java;

import java.util.List;
import java.util.stream.Collectors;

public class Kata {

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(f -> f instanceof Integer).map(m -> (Integer)m).collect(Collectors.toList());
    }
}

