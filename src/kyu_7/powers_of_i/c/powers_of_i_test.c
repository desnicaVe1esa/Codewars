#include <criterion/criterion.h>

const char *pofi(unsigned n);

Test(basic_tests, powers_0_through_10) {
    cr_assert_str_eq(pofi(0), "1");
    cr_assert_str_eq(pofi(1), "i");
    cr_assert_str_eq(pofi(2), "-1");
    cr_assert_str_eq(pofi(3), "-i");
    cr_assert_str_eq(pofi(4), "1");
    cr_assert_str_eq(pofi(5), "i");
    cr_assert_str_eq(pofi(6), "-1");
    cr_assert_str_eq(pofi(7), "-i");
    cr_assert_str_eq(pofi(8), "1");
    cr_assert_str_eq(pofi(9), "i");
    cr_assert_str_eq(pofi(10), "-1");
}