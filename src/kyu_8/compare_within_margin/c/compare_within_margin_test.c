#include <criterion/criterion.h>

int close_compare(int a, int b, int margin);

Test(ExampleTests, ShouldPassAllTheTestsProvided) {
  {
    const int a = 4;
    const int b = 5;
    const int margin = 0;
    
    const int expected = -1;
    const int received = close_compare(a, b, margin);
    
    cr_assert_eq(expected, received, "Expected: %d Received: %d", expected, received);
  }
  
  {
    const int a = 5;
    const int b = 5;
    const int margin = 0;
    
    const int expected = 0;
    const int received = close_compare(a, b, margin);
    
    cr_assert_eq(expected, received, "Expected: %d Received: %d", expected, received);
  }
  
  {
    const int a = 6;
    const int b = 5;
    const int margin = 0;
    
    const int expected = 1;
    const int received = close_compare(a, b, margin);
    
    cr_assert_eq(expected, received, "Expected: %d Received: %d", expected, received);
  }
  
  {
    const int a = 2;
    const int b = 5;
    const int margin = 3;
    
    const int expected = 0;
    const int received = close_compare(a, b, margin);
    
    cr_assert_eq(expected, received, "Expected: %d Received: %d", expected, received);
  }
  
  {
    const int a = 5;
    const int b = 5;
    const int margin = 3;
    
    const int expected = 0;
    const int received = close_compare(a, b, margin);
    
    cr_assert_eq(expected, received, "Expected: %d Received: %d", expected, received);
  }
  
  {
    const int a = 8;
    const int b = 5;
    const int margin = 3;
    
    const int expected = 0;
    const int received = close_compare(a, b, margin);
    
    cr_assert_eq(expected, received, "Expected: %d Received: %d", expected, received);
  }
  
  {
    const int a = 2;
    const int b = 5;
    const int margin = 3;
    
    const int expected = 0;
    const int received = close_compare(a, b, margin);
    
    cr_assert_eq(expected, received, "Expected: %d Received: %d", expected, received);
  }
}