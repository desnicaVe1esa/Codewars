package multiples_of_3_or_5;

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
