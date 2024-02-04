package kyu_7.mumbling.groovy

class Kata {
    static def accum(s) {
        s.toList()
                .withIndex()
                .collect{c, i -> c.toUpperCase() + c.toLowerCase() * i}
                .join("-")
    }
}
