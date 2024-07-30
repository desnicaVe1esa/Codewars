#include <string.h>
#include <stdlib.h>
#include <criterion/criterion.h>

static void do_test (const char *input, const char *expected);

Test(tests_suite, sample_tests)
{
	do_test("abc", "bac");
	do_test("aaabcccbaaa", "bbbacccabbb"); 
	do_test("ccccc", "ccccc");
	do_test("", ""); 
	do_test("abababababababab", "babababababababa"); 
	do_test("aaaaa", "bbbbb");
}

extern char *switcheroo (char *string);
extern char *strdup (const char *string); 

static void do_test (const char *input, const char *expected)
{
	char *user_string = strdup(input);
	char *actual = switcheroo(user_string);
	if (user_string != actual)
		cr_assert_fail("return the given string");
	cr_assert_str_eq(actual, expected,
		"input:\n\"%s\"\nexpected:\n\"%s\"\nactual:\n\"%s\"",
		input, expected, actual
	);
	free(user_string);
}