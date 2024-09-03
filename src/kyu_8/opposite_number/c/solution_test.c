#include <criterion/criterion.h>

float opposite(float);

Test(basic_tests, should_pass_all_the_tests_provided) {
    cr_assert_eq(opposite(-1), 1);
    cr_expect_eq(opposite(14), -14);
    cr_assert_eq(opposite(-34), 34);
}