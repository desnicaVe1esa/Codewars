package replace_all_vowel_to_exclamation_mark_in_the_sentence;

// Заменяет все гласные в предложении восклицательным знаком.
public class Solution {
    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");
    }
}