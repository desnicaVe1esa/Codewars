#include <criterion/criterion.h>
#include <stdio.h>

int seats_in_theater(int nCols, int nRows, int col, int row);
static void do_test(int nCols, int nRows, int col, int row, int expected);
static void complete_test();

Test(sample_test, basic_tests)
{
    do_test(16,11,5,3,96);
    do_test(1,1,1,1,0);
    do_test(13,6,8,3,18);
    do_test(60,100,60,1,99);
    do_test(1000,1000,1000,1000,0);
    complete_test();
}
static void do_test(int nCols, int nRows, int col, int row, int expected)
{
    int actual = seats_in_theater(nCols, nRows, col, row);
    if ( actual != expected )
        cr_assert(false, "Expected %d\nReceived %d\n", expected, actual);
}
static void complete_test()
{
    fflush(stdout);
    cr_assert(true);
}