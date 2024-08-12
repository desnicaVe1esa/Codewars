#include <criterion/criterion.h>

extern unsigned long long sum_cubes(unsigned short n);

void assert_data(unsigned short n, unsigned long long expected)
{
    unsigned long long actual = sum_cubes(n);
    cr_assert_eq(actual, expected, "*Actual*: %llu\nExpected: %llu\n    N: %hu", actual, expected, n);
}

Test(Sample_Test, should_return_the_sum_of_cubes)
{
    assert_data(2, 9ull);
    assert_data(3, 36ull);
    assert_data(4, 100ull);
    assert_data(10, 3025ull);
    assert_data(65535, 4611545282012774400ull);
}