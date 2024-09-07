package kyu_6.word_a10n_abbreviation.java;

import java.util.regex.*;

public class Abbreviator {
    public String abbreviate(String s) {
        Pattern pattern = Pattern.compile("[a-z]{4,}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            String group = matcher.group();
            int length = group.length();
            matcher.appendReplacement(result, group.substring(0, 1) + (length - 2) + group.substring(length - 1, length));
        }
        matcher.appendTail(result);
        return result.toString();
    }
}
