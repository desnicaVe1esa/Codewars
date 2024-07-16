package kyu_6.roboscript_1_implement_syntax_highlighting.java;

public class RoboScript {

    public static String highlight(String code) {
        return code
                .replaceAll("(F+)", "<span style=\"color: pink\">$1</span>")
                .replaceAll("(L+)", "<span style=\"color: red\">$1</span>")
                .replaceAll("(R+)", "<span style=\"color: green\">$1</span>")
                .replaceAll("(\\d+)", "<span style=\"color: orange\">$1</span>");
    }
}
