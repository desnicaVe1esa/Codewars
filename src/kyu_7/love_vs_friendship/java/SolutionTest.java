package kyu_7.love_vs_friendship.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("Test predefined words")
    void testSomething() {
        assertEquals(100, LoveVsFriendship.wordsToMarks("attitude"), "Input: 'attitude'");
        assertEquals(75, LoveVsFriendship.wordsToMarks("friends"), "Input: 'friends'");
        assertEquals(66, LoveVsFriendship.wordsToMarks("family"), "Input: 'family'");
        assertEquals(99, LoveVsFriendship.wordsToMarks("selfness"), "Input: 'selfness'");
        assertEquals(96, LoveVsFriendship.wordsToMarks("knowledge"), "Input: 'knowledge'");
        assertEquals(225, LoveVsFriendship.wordsToMarks("incomprehensibility"), "Input: 'incomprehensibility'");
    }
}
