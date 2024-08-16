package kyu_6.texting_with_an_old_school_mobile_phone.java;

import java.util.HashMap;

public class Kata {
    public static String sendMessage(String message) {
        if (message.length() == 0) {
            return "";
        }
        HashMap<String, String> map = makeMap();
        String[] msg = message.split("");
        boolean bCase = false;
        String retval = "";
        String prev = " ";
        String curr;
        for (String s : msg) {
            if (bCase != Character.isUpperCase(s.charAt(0))
                    && s.charAt(0) != '\''
                    && s.charAt(0) != '-'
                    && s.charAt(0) != '+'
                    && s.charAt(0) != '='
                    && s.charAt(0) != ' '
                    && s.charAt(0) != '.'
                    && s.charAt(0) != ','
                    && s.charAt(0) != '*'
                    && s.charAt(0) != '!'
                    && s.charAt(0) != '?'
                    && s.charAt(0) != '0'
                    && s.charAt(0) != '1'
                    && s.charAt(0) != '2'
                    && s.charAt(0) != '3'
                    && s.charAt(0) != '4'
                    && s.charAt(0) != '5'
                    && s.charAt(0) != '6'
                    && s.charAt(0) != '7'
                    && s.charAt(0) != '8'
                    && s.charAt(0) != '9'
                    && s.charAt(0) != '#'
            ) {
                retval += "#";
                prev = " ";
            }

            if (s.charAt(0) != '\''
                    && s.charAt(0) != '-'
                    && s.charAt(0) != '+'
                    && s.charAt(0) != '='
                    && s.charAt(0) != ' '
                    && s.charAt(0) != '.'
                    && s.charAt(0) != ','
                    && s.charAt(0) != '*'
                    && s.charAt(0) != '!'
                    && s.charAt(0) != '?'
                    && s.charAt(0) != '0'
                    && s.charAt(0) != '1'
                    && s.charAt(0) != '2'
                    && s.charAt(0) != '3'
                    && s.charAt(0) != '4'
                    && s.charAt(0) != '5'
                    && s.charAt(0) != '6'
                    && s.charAt(0) != '7'
                    && s.charAt(0) != '8'
                    && s.charAt(0) != '9'
                    && s.charAt(0) != '#'
            ) {
                bCase = Character.isUpperCase(s.charAt(0));
            }
            s = s.toLowerCase();
            curr = map.get(s);
            if (curr.charAt(0) == prev.charAt(0)) {
                if (2 <= prev.length()) {
                    if (prev.charAt(1) == '-') {

                    } else {
                        retval += " ";
                    }
                } else {
                    retval += " ";
                }
            }
            retval += curr;
            prev = curr;


        }
        return retval;
    }

    public static HashMap makeMap() {
        HashMap map = new HashMap<String, String>();
        map.put(".", "1");
        map.put(",", "11");
        map.put("?", "111");
        map.put("!", "1111");

        map.put("a", "2");
        map.put("b", "22");
        map.put("c", "222");

        map.put("d", "3");
        map.put("e", "33");
        map.put("f", "333");

        map.put("g", "4");
        map.put("h", "44");
        map.put("i", "444");

        map.put("j", "5");
        map.put("k", "55");
        map.put("l", "555");

        map.put("m", "6");
        map.put("n", "66");
        map.put("o", "666");

        map.put("p", "7");
        map.put("q", "77");
        map.put("r", "777");
        map.put("s", "7777");

        map.put("t", "8");
        map.put("u", "88");
        map.put("v", "888");

        map.put("w", "9");
        map.put("x", "99");
        map.put("y", "999");
        map.put("z", "9999");

        map.put("*", "*-");
        map.put("#", "#-");


        map.put("'", "*");
        map.put("-", "**");
        map.put("+", "***");
        map.put("=", "****");

        map.put("0", "0-");
        map.put("1", "1-");
        map.put("2", "2-");
        map.put("3", "3-");
        map.put("4", "4-");
        map.put("5", "5-");
        map.put("6", "6-");
        map.put("7", "7-");
        map.put("8", "8-");
        map.put("9", "9-");

        map.put(" ", "0");

        return map;
    }
}