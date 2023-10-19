package highest_and_lowest.java;
public class Kata {
    public static String highAndLow(String numbers) {
        String[] arr = numbers.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String s : arr) {
            int currentNum = Integer.parseInt(s);
            max = Math.max(max, currentNum);
            min = Math.min(min, currentNum);
        }
        return max + " " + min;
    }
}
