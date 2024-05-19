package kyu_6.multiplication_table.groovy;

class Kata {
    static def multiplicationTable(Integer size) {
        (1..size).collect { i ->
            (1..size).collect { j ->
                j * i
            }
        }
    }
}
