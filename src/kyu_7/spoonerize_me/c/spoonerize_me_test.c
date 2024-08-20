#include <string.h>
#include <stdlib.h>
#include <criterion/criterion.h>

extern char *spoonerize (const char *words, char *spoonerized);

static void do_test (const char *words, const char *expected)
{
	size_t size = strlen(words) + 1;
	char *user_string = memset(malloc(size), '@', size);
	char *actual = spoonerize(words, user_string);
	if (actual != user_string)
		cr_assert_fail("you must return the given string");

	cr_assert_str_eq(actual, expected,
		"for words:\n\"%s\"\nexpected:\n\"%s\"\nbut got:\n\"%s\"",
		words, expected, actual
	);
	free(user_string);
}

Test(tests_suite, sample_tests)
{
	do_test("not picking", "pot nicking");
	do_test("wedding bells", "bedding wells");
	do_test("jelly beans", "belly jeans");
	do_test("pop corn", "cop porn");
}