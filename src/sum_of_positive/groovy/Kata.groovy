package sum_of_positive.groovy

class Kata {
    static positiveSum(list) {
        def sum = 0
        list.each { number ->
            if (number > 0) {
                sum += number
            }
        }
        return sum
    }
}
