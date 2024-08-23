package kyu_8.string_cleaning.java;

class StringCleaning {
    static String stringClean(final String text) {
        return text.replaceAll("\\d*", "");
    }
}