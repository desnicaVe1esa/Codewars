package kyu_7.the_office_iii_broken_photocopier.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTests {

  @Test
  public void tests() {
    // assertEquals("expected", "actual");
    assertEquals("0", Kata.broken("1"));
    assertEquals("01111111010010000001100110111", Kata.broken("10000000101101111110011001000"));
    assertEquals("011101", Kata.broken("100010"));
  }

}