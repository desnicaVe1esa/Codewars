package kyu_7.mew_cipher.java;

public class ForemanPig {
    public static String decipher(String[] code) {
        StringBuilder result = new StringBuilder();
        String alphabet = " abcdefghijklmnopqrstuvwxyz";
        int sum = 0;
        for (int i = 0; i < code[0].length(); i ++) {
            for (String s : code) {
                sum += alphabet.indexOf(s.charAt(i));
            }
            result.append(alphabet.charAt(sum / code.length));
            sum = 0;
        }
        return result.toString();
    }
}
