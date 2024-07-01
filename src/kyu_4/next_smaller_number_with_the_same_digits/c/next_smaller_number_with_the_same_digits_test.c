#include <stdio.h>
#include <criterion/criterion.h>

long long next_smaller_number(unsigned long long n);
static void dotest(unsigned long long n, long long expected);


Test(the_multiply_function, should_pass_all_the_tests_provided) {
    dotest(  21,  12);
    dotest( 907, 790);
    dotest( 531, 513);
    dotest(1027,  -1);
    dotest( 441, 414);
    dotest(123456798, 123456789);
}

static void dotest(unsigned long long n, long long expected) {
  long long actual = next_smaller_number(n);
  cr_assert_eq(actual, expected, "Incorrect answer for n=%llu\n  Expected: %lld\n    Actual: %lld", n, expected, actual);
}