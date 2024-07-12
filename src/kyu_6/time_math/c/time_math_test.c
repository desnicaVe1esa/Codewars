#include <criterion/criterion.h>

extern char *time_math(char *time3, const char *time1, char op, const char *time2);
static void doTest(const char *time1, char op, const char *time2, const char *expected);

Test(Time_Math, add)
{
    doTest("01:24:31", '+', "02:16:05", "03:40:36");
    doTest("01:24:31", '+', "22:35:28", "23:59:59");
}

Test(Time_Math, subtract)
{
    doTest("11:24:31", '-', "11:24:31", "00:00:00");
    doTest("11:24:31", '-', "03:15:28", "08:09:03");
}

static void doTest(const char *time1, char op, const char *time2, const char *expected)
{
	char user_string[32] = "@@@@@@@@@@@@@@@@@@@";
    char *actual = time_math(user_string, time1, op, time2);
    if (actual != user_string)
		cr_assert_fail("you must return the given string");
    cr_assert_str_eq(actual, expected,
		"for \"%s\" '%c' \"%s\", expected \"%s\", but got \"%s\"",
		time1, op, time2, expected, actual
	);
}