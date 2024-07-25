#include <criterion/criterion.h>
#include <stdio.h>

char *sortMyString(const char *s);
static void doTest(const char *s, const char *expected);

Test(Other_Tests, Static_Ones)
{
    doTest("CodeWars", "CdWr oeas");
    doTest("YCOLUE'VREER", "YOU'RE CLEVER");
    fflush(stdout);
    cr_assert(true);
}
static void doTest(const char *s, const char *expected)
{
    char *actual = sortMyString(s);
    if ( !actual ) cr_assert_not_null(actual, "Received NULL ptr\n");
    if ( strcmp(actual, expected) != 0 )
        cr_assert_str_eq(actual, expected, "Expected %s\nReceived %s\n", expected, actual);
    free(actual);
}