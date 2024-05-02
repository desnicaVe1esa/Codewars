package kyu_5.beginners_spy_kit.java;

public class FiboDecrypt {
    public String decrypt(String encrypted, String password) {
        char[] cipherArray = encrypted.toCharArray();

        int[] fibonacci = new int[Math.max(2, password.length())];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < password.length(); i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < cipherArray.length; j++) {
                if (j % 2 == 0) {
                    cipherArray[j] = (char) ((cipherArray[j] - 'a' - fibonacci[i] + 26) % 26 + 'a');
                } else {
                    cipherArray[j] = (char) ((cipherArray[j] - 'a' + fibonacci[i] + 26) % 26 + 'a');
                }
            }
        }

        return new StringBuilder(new String(cipherArray)).reverse().substring(password.length());
    }
}