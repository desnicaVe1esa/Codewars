package kyu_7.alternate_capitalization.java;

class Solution{
    public static String[] capitalize(String s){
        String[] result = new String[2];
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                s1 += Character.toString(s.charAt(i) - 32);
                s2 += s.charAt(i);
            } else {
                s1 += s.charAt(i);
                s2 += Character.toString(s.charAt(i) - 32);
            }
        }
        result[0] = s1;
        result[1] = s2;
        return result;
    }
}