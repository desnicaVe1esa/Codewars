package kyu_7.ordered_count_of_characters.groovy;

class Kata {
    static def orderedCount(input) {
        input.toList().groupBy{it}.collect{ k,v -> [k,v.size()]}
    }
}
