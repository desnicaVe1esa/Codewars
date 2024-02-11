package kyu_8.count_by_x.groovy

class Kata {
    static countBy(x, n) {
        def result = []
        for (def i = 0; i < n; i++) {
            result[i] = x * (i + 1);
        }
        return result
    }
}
