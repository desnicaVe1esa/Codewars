package highest_scoring_word.java;
public class Kata {
    public static String high(String s) {
        String[] arrStr = s.split(" ");
        int biggestSum = 0;
        String biggestWord = "";

        for (String word : arrStr) {
            int sum = 0;
            for (char ch : word.toLowerCase().toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    sum += 1 + ch - 'a';
                }
            }

            if (sum > biggestSum) {
                biggestSum = sum;
                biggestWord = word;
            }
        }
        return biggestWord;
    }
}
