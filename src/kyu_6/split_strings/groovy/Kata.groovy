package kyu_6.split_strings.groovy;


class Kata {
    static List<String> solution(String str) {
        String[] strings = str.length() % 2 == 0 ? new String[str.length() / 2]
                : new String[str.length() / 2 + 1]
        int from = 0, to = 2
        for (int i = 0; i < strings.length; i++) {
            if (to > str.length() && str.length() % 2 != 0) {
                strings[i] =  str.substring(from, to - 1) + "_"
                break
            } else {
                if (to > str.length()) {
                    break
                }
                strings[i] = str.substring(from, to)
            }
            from += 2
            to += 2
        }
        return strings
    }
}