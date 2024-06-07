package kyu_6.make_the_deadfish_swim.groovy

class DeadFish {
    static def parse(String dateString) {
        def value = 0;
        def result = []
        dateString.each { c ->
            if (c == 'i') { value += 1 }
            if (c == 'd') { value -= 1 }
            if (c == 's') { value *= value }
            if (c == 'o') { result << value }
        }
        result
    }
}