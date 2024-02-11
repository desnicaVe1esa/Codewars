package kyu_4.strip_comments.java;

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {
        if (text.isEmpty()) {
            return null;
        }

        final StringBuilder sb = new StringBuilder();
        final String[] lines = text.split("\n");

        for (final String s : lines) {
            final StringBuilder helper = new StringBuilder();
            int commentStartPosition = s.length();

            if (commentStartPosition != 0) {
                for (String comment : commentSymbols) {
                    if (s.contains(comment)) {
                        commentStartPosition = Math.min(commentStartPosition, s.indexOf(comment));
                    }
                }
                helper.append(s, 0, commentStartPosition);
            }

            while (helper.length() != 0 && helper.charAt(helper.length() - 1) == ' ') {
                helper.setLength(helper.length() - 1);
            }

            helper.append("\n");
            sb.append(helper);
        }

        if (sb.length() != 0) {
            sb.setLength(sb.length() - 1);
        }

        return new String(sb);
    }
}

