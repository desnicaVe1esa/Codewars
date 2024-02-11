package kyu_6.mexican_wave.groovy

class Kata {
    static String[] wave(String str) {
        def result = []
        for (int i = 0; i < str.length(); i++) {
            if (str[i] != ' ') {
                result << str.substring(0, i) + str[i].toUpperCase() + str.substring(i + 1)
            }
        }
        return result
    }
}
