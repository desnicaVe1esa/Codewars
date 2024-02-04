package kyu_8.is_n_divisible_by_x_and_y.groovy

class Kata {
    static def isDivisible(n, x, y) {
        return n % x == 0 && n % y == 0
    }
}
