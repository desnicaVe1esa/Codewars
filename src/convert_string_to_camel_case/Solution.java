package convert_string_to_camel_case;

// Преобразует стиль строки в camel case

import java.lang.StringBuilder;

class Solution{
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }

    static String toCamelCase(String s){
        StringBuilder sb = new StringBuilder();
        Boolean nextCapital = false;
        for (int i=0; i<s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                char tmp = s.charAt(i);
                if (nextCapital) tmp = Character.toUpperCase(tmp);
                sb.append(tmp);
                nextCapital = false;
            } else {
                nextCapital = true;
            }
        }
        return sb.toString();
    }
}