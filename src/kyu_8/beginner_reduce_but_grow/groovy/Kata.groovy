package kyu_8.beginner_reduce_but_grow.groovy

class Kata {
    static def grow(numbers) {
        def result = 1;
        for (def i : numbers) {
            result *= i;
        }
        return result;
    }
}
