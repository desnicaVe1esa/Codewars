package playing_with_passphrases.java;

public class PlayPass {
    public static String playPass(String s, int n) {
        char[] str = s.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length; ++i) {
            char ch = str[i];
            if(Character.isLetter(ch)) {
                ch = (char)((ch - 97 + n) % 26 + (i % 2 == 0 ? 65 : 97));
            }
            else if(Character.isDigit(ch)) {
                ch = (char)(57 - ch + 48);
            }
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}
