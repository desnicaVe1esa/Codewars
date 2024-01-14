package kyu_6.multiples_of_3_or_5;

// Получить сумму всех чисел кратных 3 и 5, которые находятся в диапазоне числа number

public class Solution {

    public int solution(int number) {
        int sum = 0;
        for (int i = 0; number > i; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
