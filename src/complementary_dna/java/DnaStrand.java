package complementary_dna.java;

import java.util.Arrays;

public class DnaStrand {
    public static String makeComplement(String dna) {
        String result = "";
        char[] dnaChars = dna.toCharArray();
        for (int i = 0; i < dnaChars.length; i++) {
            switch (dnaChars[i]) {
                case 'A' -> dnaChars[i] = 'T';
                case 'T' -> dnaChars[i] = 'A';
                case 'G' -> dnaChars[i] = 'C';
                case 'C' -> dnaChars[i] = 'G';
            }
        }
        result = Arrays.toString(dnaChars);
        return result.replaceAll("[\\[\\],\\s]", "");
    }
}
