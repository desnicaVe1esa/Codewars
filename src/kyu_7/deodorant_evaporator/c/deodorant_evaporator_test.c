#include <criterion/criterion.h>

extern int evaporator(double content, double evap_per_day, double threshold);

static void doTest(double content, double evap_per_day, double threshold, int expected) {
	int actual = evaporator(content, evap_per_day, threshold);

	cr_assert_eq(actual, expected,
		"content = %.17g\n"
		"evap_per_day = %.17g\n"
		"threshold = %.17g\n"
		"expected %d, but got %d",
		content, evap_per_day, threshold,
		expected, actual
	);
}

Test(tests_suite, sample_tests) {
    doTest(10, 10, 10, 22);
    doTest(10, 10, 5, 29);
    doTest(100, 5, 5, 59);
    doTest(50, 12, 1, 37);
    doTest(47.5, 8, 8, 31);
    doTest(100, 1, 1, 459);
    doTest(10, 1, 1, 459);
    doTest(100, 1, 5, 299);
}