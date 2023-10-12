package count_the_digit.groovy

class Kata {
    static int nbDig(int n, int d) {
        def k = 0;
        def result;
        def iterator = 0;
        def count = 0;
        while (iterator <= n) {
            result = k * k;
            def arr = result.toString().split('');
            for (def i = 0; i < arr.length; i++) {
                if (arr[i] == d.toString()) { count++; }
            }
            k++;
            iterator++;
        }
        return count;
    }
}
