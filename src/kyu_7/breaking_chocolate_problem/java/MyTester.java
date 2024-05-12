package kyu_7.breaking_chocolate_problem.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTester {

  @Test
  public void myTests() {
    assertEquals(24, Chocolate.breakChocolate(5, 5), "The answer for 5x5 should be 24");
    assertEquals(0, Chocolate.breakChocolate(1, 1), "The answer for 1x1 should be 0");  }
}
