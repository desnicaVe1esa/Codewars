#include <stdlib.h>
#include <criterion/criterion.h>

char *revrot(const char *s, int sz);

static void dotest(const char *s, int sz, const char *expected) {
	char *actual = revrot(s, sz);
	cr_assert_str_eq(actual, expected,
		"for sz = %d and s = \"%s\"\n"
		"expected \"%s\"\nbut got  \"%s\"",
		sz, s, expected, actual
	);
	free(actual);
}

Test(revrot, SampleTests) {
	dotest("1234", 0, "");
	dotest("", 0, "");
	dotest("1234", 5, "");
	dotest("733049910872815764", 5, "330479108928157");
	dotest("73304991087281576455176044327690580265896", 8, "1994033775182780067155464327690480265895");
}