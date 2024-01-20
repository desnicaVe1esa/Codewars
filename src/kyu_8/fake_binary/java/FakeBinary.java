package kyu_8.fake_binary.java;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder result = new StringBuilder();
        char[] chars = numberString.toCharArray();
        for (char c : chars) {
            if (c < '5') {
                result.append("0");
            } else {
                result.append("1");
            }
        }
        return result.toString();
    }
}