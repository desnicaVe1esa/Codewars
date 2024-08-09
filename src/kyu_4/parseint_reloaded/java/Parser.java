package kyu_4.parseint_reloaded.java;


import java.util.Arrays;
import java.util.List;

public class Parser {

    public static int parseInt(String numStr) {
        boolean isValidInput = true;
        int prepared = 0;
        int result = 0;
        List<String> allowedStrings = Arrays.asList
                (
                        "zero", "one", "two", "three", "four", "five", "six", "seven",
                        "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
                        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
                        "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety",
                        "hundred", "thousand", "million", "billion", "trillion"
                );

        if (numStr != null && numStr.length() > 0) {
            numStr = numStr.replaceAll("-", " ");
            numStr = numStr.toLowerCase().replaceAll(" and", " ");
            String[] splittedParts = numStr.trim().split("\\s+");

            for (String str : splittedParts) {
                if (!allowedStrings.contains(str)) {
                    isValidInput = false;
                    break;
                }
            }
            if (isValidInput) {
                for (String str : splittedParts) {
                    if (str.equalsIgnoreCase("zero")) {
                        prepared += 0;
                    } else if (str.equalsIgnoreCase("one")) {
                        prepared += 1;
                    } else if (str.equalsIgnoreCase("two")) {
                        prepared += 2;
                    } else if (str.equalsIgnoreCase("three")) {
                        prepared += 3;
                    } else if (str.equalsIgnoreCase("four")) {
                        prepared += 4;
                    } else if (str.equalsIgnoreCase("five")) {
                        prepared += 5;
                    } else if (str.equalsIgnoreCase("six")) {
                        prepared += 6;
                    } else if (str.equalsIgnoreCase("seven")) {
                        prepared += 7;
                    } else if (str.equalsIgnoreCase("eight")) {
                        prepared += 8;
                    } else if (str.equalsIgnoreCase("nine")) {
                        prepared += 9;
                    } else if (str.equalsIgnoreCase("ten")) {
                        prepared += 10;
                    } else if (str.equalsIgnoreCase("eleven")) {
                        prepared += 11;
                    } else if (str.equalsIgnoreCase("twelve")) {
                        prepared += 12;
                    } else if (str.equalsIgnoreCase("thirteen")) {
                        prepared += 13;
                    } else if (str.equalsIgnoreCase("fourteen")) {
                        prepared += 14;
                    } else if (str.equalsIgnoreCase("fifteen")) {
                        prepared += 15;
                    } else if (str.equalsIgnoreCase("sixteen")) {
                        prepared += 16;
                    } else if (str.equalsIgnoreCase("seventeen")) {
                        prepared += 17;
                    } else if (str.equalsIgnoreCase("eighteen")) {
                        prepared += 18;
                    } else if (str.equalsIgnoreCase("nineteen")) {
                        prepared += 19;
                    } else if (str.equalsIgnoreCase("twenty")) {
                        prepared += 20;
                    } else if (str.equalsIgnoreCase("thirty")) {
                        prepared += 30;
                    } else if (str.equalsIgnoreCase("forty")) {
                        prepared += 40;
                    } else if (str.equalsIgnoreCase("fifty")) {
                        prepared += 50;
                    } else if (str.equalsIgnoreCase("sixty")) {
                        prepared += 60;
                    } else if (str.equalsIgnoreCase("seventy")) {
                        prepared += 70;
                    } else if (str.equalsIgnoreCase("eighty")) {
                        prepared += 80;
                    } else if (str.equalsIgnoreCase("ninety")) {
                        prepared += 90;
                    } else if (str.equalsIgnoreCase("hundred")) {
                        prepared *= 100;
                    } else if (str.equalsIgnoreCase("thousand")) {
                        prepared *= 1000;
                        result += prepared;
                        prepared = 0;
                    } else if (str.equalsIgnoreCase("million")) {
                        prepared *= 1000000;
                        result += prepared;
                        prepared = 0;
                    } else if (str.equalsIgnoreCase("billion")) {
                        prepared *= 1000000000;
                        result += prepared;
                        prepared = 0;
                    } else if (str.equalsIgnoreCase("trillion")) {
                        prepared *= 1000000000000L;
                        result += prepared;
                        prepared = 0;
                    }
                }

                result += prepared;
            }
        }
        return result;
    }
}