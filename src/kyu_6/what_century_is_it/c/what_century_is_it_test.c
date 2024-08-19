#include <criterion/criterion.h>

extern char *century_from_year (char *century_string, const char year[4 + 1]);
static void do_test (const char year[4 + 1], const char *expected);

Test(tests_suite, sample_tests)
{
	do_test("0001",  "1st");
	do_test("1054", "11th");
	do_test("2054", "21st");

	do_test("0171",  "2nd");
	do_test("1171", "12th");
	do_test("2171", "22nd");

	do_test("0265",  "3rd");
	do_test("1265", "13th");
	do_test("2265", "23rd");

	do_test("0354",  "4th");
	do_test("1354", "14th");
	do_test("2354", "24th");

	do_test("2000", "20th");
	do_test("9999", "100th");
}

static void do_test (const char year[4 + 1], const char *expected)
{
	char user_string[sizeof "100th"] = "@@@@@@";
	char *actual = century_from_year(user_string, year);

	if (actual != user_string)
		cr_assert_fail("you must return the given string");

	cr_assert_str_eq(actual, expected,
		"for year:\n\"%s\"\nexpected:\n\"%s\"\nbut got:\n\"%s\"",
		year, expected, actual
	);
}