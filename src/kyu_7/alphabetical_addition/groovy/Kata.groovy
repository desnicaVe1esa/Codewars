package kyu_7.alphabetical_addition.groovy;

class Kata {
    static String addLetters(List<String> letters) {
        List alpha = ['z'] + ('a'..'y')
        int letterConvert = letters.collect {
            alpha.indexOf(it)
        }.sum()
                ?: 0 as int

        alpha[letterConvert % 26]
    }
}