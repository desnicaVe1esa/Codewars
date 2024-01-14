package kyu_6.replace_with_alphabet_position.groovy

class Kata {
    static def alphabetPosition(text) {
        text.findAll(/(?i)[a-z]/){ (int)it.toLowerCase() - (int)'a' + 1 }.join(" ")
    }
}
