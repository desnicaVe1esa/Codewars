#include <stdint.h>
#include <criterion/criterion.h>

int digits(uint64_t);

Test(sample_tests, digits) {
    cr_assert_eq(digits(5ull), 1);
    cr_assert_eq(digits(12345ull), 5);
    cr_assert_eq(digits(9876543210ull), 10);
    cr_assert_eq(digits(18446744073709551615ull), 20);
}
