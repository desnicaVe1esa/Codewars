#include <stdlib.h>
#include <criterion/criterion.h>

static void do_test (const char *input, const char *expected);

Test(tests_suite, sample_tests)
{
	do_test("", "!");
	do_test("!", "!");
	do_test("Hi", "Hi!");
	do_test("Hi!", "Hi!");
	do_test("Hi!!!!", "Hi!");
	do_test("!Hi", "Hi!");
	do_test("!Hi!", "Hi!");
	do_test("Hi Hi!!", "Hi Hi!");
	do_test("Hi!\nHi", "Hi\nHi!");
}

extern char *remove_bang (const char *string);

static void do_test (const char *input, const char *expected)
{
	char *actual = remove_bang(input);
	cr_assert_str_eq(actual, expected,
		"for string:\n\"%s\"\nexpected:\n\"%s\"\nbut got:\n\"%s\"",
		input, expected, actual
	);
	free(actual);
}