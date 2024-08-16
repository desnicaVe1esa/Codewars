package kyu_6.texting_with_an_old_school_mobile_phone.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
  private static void testing_send(String input, String expected) {
    String actual = Kata.sendMessage(input);
    assertEquals(expected, actual);
  }

  @Test
  public void sampleTests() {
    testing_send("hey", "4433999");
    testing_send("one two three", "666 6633089666084477733 33");
    testing_send("Hello World!", "#44#33555 5556660#9#66677755531111");
    testing_send("Def Con 1!", "#3#33 3330#222#666 6601-1111");
    testing_send("A-z", "#2**#9999");
    testing_send("1984", "1-9-8-4-");
    testing_send("Big thanks for checking out my kata", "#22#444 4084426655777703336667770222443322255444664066688 806999055282");
  }
}