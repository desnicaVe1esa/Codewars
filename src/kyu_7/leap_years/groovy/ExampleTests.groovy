package kyu_7.leap_years.groovy;

import org.junit.jupiter.api.*
import static org.junit.jupiter.api.Assertions.assertEquals

class ExampleTests
{
  @Test
  void "Should return true for year 2020"()
  {
    assertEquals(true, Kata.isLeapYear(2020));
  }

  @Test
  void "Should return true for year 2000"()
  {
    assertEquals(true, Kata.isLeapYear(2000));
  }

  @Test
  void "Should return false for year 2015"()
  {
    assertEquals(false, Kata.isLeapYear(2015));
  }

  @Test
  void "Should return false for year 2100"()
  {
    assertEquals(false, Kata.isLeapYear(2100));
  }
}
