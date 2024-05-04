package kyu_6.millipede_of_words.groovy

class Millipede {
    static boolean check(def millipede) {
        def perm = []
        millipede.toList().eachPermutation { perm << it }
        perm.find {
            it.collect { it[0, -1] }
                    .join('-')
                    .findAll(/(.)-\1/)
                    .size() == it.size() - 1
        }
    }
}
