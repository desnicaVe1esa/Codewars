#include <criterion/criterion.h>
#include <stdbool.h>

bool validate(long digits);
void tester(long digits, bool expected);

Test(Sample_Tests, should_pass_all_the_tests_provided) {
    tester( 123, false);
    tester(   1, false);
    tester(2121,  true);
    tester(1230,  true);
}