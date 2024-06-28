package kyu_8.formatting_decimal_places_number_0.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersTest {
  @Test
  public void Test_01() {
    assertEquals(4.66, Numbers.TwoDecimalPlaces(4.659725356), 0.00);
  }

  @Test
  public void Test_02() {
    assertEquals(173735326.38, Numbers.TwoDecimalPlaces(173735326.3783732637948948), 0.00);
  }
}