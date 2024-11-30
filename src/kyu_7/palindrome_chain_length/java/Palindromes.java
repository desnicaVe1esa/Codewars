package kyu_7.palindrome_chain_length.java;

public class Palindromes {
    public static int palindromeChainLength (long n) {
        String check = n + "";
        StringBuilder sbRevers = new StringBuilder(n + "");
        String revers = sbRevers.reverse() + "";

        if (check.equals(revers)) {
            return 0;
        } else {
            int steps = 0;
            long intCheck = Long.parseLong(check);
            long intRevers = Long.parseLong(revers);
            while (true) {
                long sum = intCheck + intRevers;
                String revSum = new StringBuilder(sum + "").reverse().toString();
                if (String.valueOf(sum).equals(revSum)) {
                    steps++;
                    break;
                }
                intCheck = sum;
                intRevers = Long.parseLong(revSum);
                steps++;
            }
            return steps;
        }
    }
}
