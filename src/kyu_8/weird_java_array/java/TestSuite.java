package kyu_8.weird_java_array.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestsSuite {
    private static final List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
    );

    @Test
    void shouldHoldCorrectValues() {
        var arrayOfLists = Codewarrior.arrayOfLists;
        String msg = "the array must have a length of " + listOfLists.size();
        assertEquals(listOfLists.size(), arrayOfLists.length, msg);

        for (int i = 0; i < listOfLists.size(); i++)
            assertEquals(listOfLists.get(i), arrayOfLists[i]);
    }
}
