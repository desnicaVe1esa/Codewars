package kyu_8.sum_of_multiples.groovy;

class Kata {
    static sumMul(n, m) {
        if (n >= m) return 'INVALID'
        def sum = 0;
        for (Long i = n; i < m; i += n) {
            sum += i
        }
        return sum
    }
}