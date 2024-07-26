#include <criterion/criterion.h>
#include <stdbool.h>

bool power_of_two(const int x);

Test(Sample_Tests, should_pass_all_the_tests_provided) {
    cr_expect_eq(power_of_two(2),   true,  "2 should return true");
    cr_expect_eq(power_of_two(50),  false, "50 should return false");
    cr_expect_eq(power_of_two(6),   false, "6 should return false");
    cr_expect_eq(power_of_two(256), true,  "256 should return true");
}