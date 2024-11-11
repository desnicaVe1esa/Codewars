package kyu_6.meeting.java;

import java.util.*;

class Meeting {

    public static String meeting(String s) {
        String[] split = s.split(";");
        Arrays.sort(split, Comparator.comparing(c -> c.split(":")[1]));
        List<String> result = new ArrayList<>();
        for (String value : split) {
            String[] data = value.toUpperCase().split(":");
            result.add("(" + data[1] + ", " + data[0] + ")");
        }
        Collections.sort(result);
        return String.join("", result);
    }
}
