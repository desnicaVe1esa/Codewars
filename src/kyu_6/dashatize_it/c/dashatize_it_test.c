#include <string.h>
#include <limits.h>
#include <criterion/criterion.h>

extern void dashatize(int number, char string[32]);
static void do_test(int number, const char *expected);

Test(sample_tests, Basic)
{
    do_test(274, "2-7-4");
    do_test(5311, "5-3-1-1");
    do_test(86320, "86-3-20");
    do_test(974302, "9-7-4-3-02");
}

Test(sample_tests, Weird)
{
    do_test(0, "0");
    do_test(-1, "1");
    do_test(-28369, "28-3-6-9");
}

Test(sample_tests, EdgeCases)
{
    do_test(INT_MAX, "2-1-4-7-48-3-64-7");
    do_test(INT_MIN, "2-1-4-7-48-3-648");
    do_test(-1111111111, "1-1-1-1-1-1-1-1-1-1");
}

static void do_test(int number, const char *expected)
{
    char actual[32];
    memset(actual, '@', sizeof actual);
    dashatize(number, actual);
    cr_assert_str_eq(actual, expected,
        "for number %d\nexpected \"%s\"\nactual   \"%s\"",
        number, expected, actual
    );
}