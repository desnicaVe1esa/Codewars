package counting_duplicates;

import java.util.Collections;
import java.util.stream.Collectors;

// Подсчет дубликатов

public class CountingDuplicates {

    public static void main(String[] args) {
        CountingDuplicates countingDuplicates = new CountingDuplicates();
        System.out.println(countingDuplicates.duplicateCount("abcdea"));
    }
    public static int duplicateCount(String text) {
        return text.toLowerCase().chars().boxed().collect(Collectors.toSet())
                .stream()
                .map(x -> Collections.frequency(text.toLowerCase().chars().boxed().toList(), x))
                .filter(x -> x > 1).toList().size();
    }
}
