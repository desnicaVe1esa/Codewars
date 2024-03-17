package kyu_7.most_digits.java;

class MostDigits {
    public static int findLongest(int[] numbers) {
        int max = countDigits(numbers[0]);
        int index = 0;
        for (int i = 1; i < numbers.length; i++) {
            int current = countDigits(numbers[i]);
            if (current > max) {
                max = current;
                index = i;
            }
        }

        return numbers[index];
    }

    public static int countDigits(int number) {
        if (number < 0 ) {
            return String.valueOf(number).length() - 1;
        }
        return String.valueOf(number).length();
    }
}