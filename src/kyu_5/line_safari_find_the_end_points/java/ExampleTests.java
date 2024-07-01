package kyu_5.line_safari_find_the_end_points.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTests {

  private static void show(String prompt, String s) {
    s = s.replace("X", "<span style='color:red'>X</span>");
    System.out.println(String.format("%s\n\n%s", prompt, s));
  }

  private void doTest(String expected, String actual) {
    if (!expected.equals(actual)) {
      show("Expected:", expected);
      show("Your solution:", actual);
    } else {
      show("", expected);
    }
    assertEquals(expected, actual);
  }

  @Test
  public void ex_Rectangle() {
    String input =
            "*********\n" +
                    "*       *\n" +
                    "*       *\n" +
                    "*********\n";
    String expected =
            "X*******X\n" +
                    "*       *\n" +
                    "*       *\n" +
                    "X*******X\n";
    doTest(expected, Dinglemouse.findEndPoints(input));
  }

  @Test
  public void ex_Diamond() {
    String input =
            "   *   \n" +
                    "  * *  \n" +
                    " *   * \n" +
                    "*     *\n" +
                    " *   * \n" +
                    "  * *  \n" +
                    "   *   \n";
    String expected =
            "   X   \n" +
                    "  * *  \n" +
                    " *   * \n" +
                    "X     X\n" +
                    " *   * \n" +
                    "  * *  \n" +
                    "   X   \n";
    doTest(expected, Dinglemouse.findEndPoints(input));
  }

  @Test
  public void ex_E() {
    String input =
            "*******\n" +
                    "*      \n" +
                    "****   \n" +
                    "*      \n" +
                    "*******\n";
    String expected =
            "X*****X\n" +
                    "*      \n" +
                    "X**X   \n" +
                    "*      \n" +
                    "X*****X\n";
    doTest(expected, Dinglemouse.findEndPoints(input));
  }

  @Test
  public void ex_Cross() {
    String input =
            "   *   \n" +
                    "   *   \n" +
                    "   *   \n" +
                    "*******\n" +
                    "   *   \n" +
                    "   *   \n" +
                    "   *   \n";
    String expected =
            "   X   \n" +
                    "   *   \n" +
                    "   *   \n" +
                    "X*****X\n" +
                    "   *   \n" +
                    "   *   \n" +
                    "   X   \n";
    doTest(expected, Dinglemouse.findEndPoints(input));
  }

}