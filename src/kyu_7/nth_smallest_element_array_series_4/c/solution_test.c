#include <criterion/criterion.h>
#include <stdio.h>

#define ARRAY_SIZE(a) (sizeof(a) / sizeof(a[0]))

int nth_smallest(const int *arr, int count, int n);
void do_test(const int *arr, int count, int n, int expected);
void complete_test();

Test(sample_test, check_positive_values)
{
    {
        int a[] = {3, 1, 2},
            n   = 2,
            exp = 2;
        do_test(a, ARRAY_SIZE(a), n, exp);
    }
    {
        int a[] = {15, 20, 7, 10, 4, 3},
            n   = 3,
            exp = 7;
        do_test(a, ARRAY_SIZE(a), n, exp);
    }
    complete_test();
}
Test(sample_test, check_negative_values)
{
    {
        int a[] = {-5, -1, -6, -18},
            n   =  4,
            exp = -1;
        do_test(a, ARRAY_SIZE(a), n, exp);
    }
    {
        int a[] = {-102, -16, -1, -2, -367, -9},
            n   =  5,
            exp = -2;
        do_test(a, ARRAY_SIZE(a), n, exp);
    }
    complete_test();
}
Test(sample_test, check_mixed_values)
{
    {
        int a[] = {2, 169, 13, -5, 0, -1},
            n   = 4,
            exp = 2;
        do_test(a, ARRAY_SIZE(a), n, exp);
    }
    {
        int a[] = {177, 225, 243, -169, -12, -5, 2, 92},
            n   =  5,
            exp = 92;
        do_test(a, ARRAY_SIZE(a), n, exp);
    }
    complete_test();
}
void do_test(const int *arr, int count, int n, int expected)
{
    int actual = nth_smallest(arr, count, n);
    if ( actual != expected )
        cr_assert(false, "Expected %d\nReceived %d\n", expected, actual);
}
void complete_test()
{
    fflush(stdout);
    cr_assert(true);
}