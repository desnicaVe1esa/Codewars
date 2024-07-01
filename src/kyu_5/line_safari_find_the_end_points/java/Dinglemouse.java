package kyu_5.line_safari_find_the_end_points.java;

public class Dinglemouse {
    public static String findEndPoints(String s) {
        return s.replaceAll(String.format("(?s)(?<=[ \\n].{%1$d}|^[^\\n]*)[*X](?=.{%1$d}[*X].{%1$d}[*X])", s.indexOf("\n")), "X")
                .replaceAll(String.format("(?s)(?<=[*X].{%1$d}[*X].{%1$d})[*X](?=.{%1$d}[ \\n]|[^\\n]*$)", s.indexOf("\n")), "X")
                .replaceAll(String.format("(?s)(?<=[ \\n].{%1$d}|^[^\\n]*)[*X](?=.{%1$d}[*X].{%1$d}[*X])", s.indexOf("\n") + 1), "X")
                .replaceAll(String.format("(?s)(?<=[*X].{%1$d}[*X].{%1$d})[*X](?=.{%1$d}[ \\n]|[^\\n]*$)", s.indexOf("\n") + 1), "X")
                .replaceAll(String.format("(?s)(?<=[ \\n].{%1$d}|^[^\\n]*)[*X](?=.{%1$d}[*X].{%1$d}[*X])", s.indexOf("\n") - 1), "X")
                .replaceAll(String.format("(?s)(?<=[*X].{%1$d}[*X].{%1$d})[*X](?=.{%1$d}[ \\n]|[^\\n]*$)", s.indexOf("\n") - 1), "X")
                .replaceAll("[*X]([*X]+)[*X]", "X$1X");
    }
}