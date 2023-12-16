package vowel_count.java;
import java.util.*;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        String lowerCaseString = str.toLowerCase();
        for (int i = 0; i < lowerCaseString.length(); ++i) {
            char charCharacter = lowerCaseString.charAt(i);
            char[] vowels = {'a', 'e', 'i', 'o', 'u'};
            if (Arrays.binarySearch(vowels, charCharacter) >= 0) {
                vowelsCount += 1;
            }
        }
        return vowelsCount;
    }
}