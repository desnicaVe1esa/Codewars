package simple_pig_latin;

import java.util.regex.Pattern;

// Перемещает первую букву каждого слова в конец, а затем добавляет «ay» в конец слова
// Оставляет знаки препинания нетронутыми

public class PigLatin {

    public static String pigIt(String str) {
        if (str == null || str.length() == 0) {
            return null;
        } else {
            String[] words = str.split("\\s");
            StringBuilder sb = new StringBuilder();

            for (String s : words) {
                if (Pattern.matches("\\p{IsPunctuation}", s)) {
                    sb.append(s)
                            .append(" ");
                } else {
                    sb.append(s.substring(1))
                            .append(s.charAt(0))
                            .append("ay ");
                }
            }

            while (sb.charAt(sb.length() - 1) == ' ') {
                sb.setLength(sb.length() - 1);
            }

            return new String(sb);
        }
    }
}
