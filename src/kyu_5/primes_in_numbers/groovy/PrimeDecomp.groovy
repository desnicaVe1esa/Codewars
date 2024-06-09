package kyu_5.primes_in_numbers.groovy;


public class PrimeDecomp {
    public static String factors(int n) {
        def result = ""
        def divisor = 2
        while (n > 1) {
            int count = 0
            while (n % divisor == 0) {
                n /= divisor
                count++
            }
            if (count > 0) {
                result += "(${divisor}" + (count > 1 ? "**${count}" : "") + ")"
            }
            divisor++
        }
        return result
    }
}