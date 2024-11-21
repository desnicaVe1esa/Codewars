package kyu_6.basic_encryption.java;

public class BasicEncrypt {

    public String encrypt(String text, int rule) {
        if (rule > 255) {
            rule -= 256;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            result.append(text.charAt(i) + rule > 255 ? (char) (text.charAt(i) + (rule - 256)) : (char) (text.charAt(i) + rule));
        }
        return result.toString();
    }
}
