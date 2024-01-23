package kyu_6.single_word_pig_latin.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatin {

//    public String translate(String str) {
//        return (str = str.toLowerCase()).matches("[aeiou][a-z]*") ? str + "way" : str.matches("[a-z]*") ? str.replaceAll("^([^aeiou]*)(.*)", "$2$1ay") : null;
//    }

    public String translate(String str){
        if (str == null) return null;

        str = str.toLowerCase();

        if (containsNonAlpha(str)) return null;
        if (startsWithVowel(str)) return str + "way";

        // Starts with consonant
        Matcher m = Pattern.compile("[^aeiou]+").matcher(str);
        m.find();
        String end = m.group();
        return str.substring(end.length(), str.length()) + end + "ay";
    }

    private boolean containsNonAlpha(String str) {
        return str.matches("[a-z]*[^a-z]+.*");
    }

    private boolean startsWithVowel(String str) {
        return str.matches("[aeiou].*");
    }
}