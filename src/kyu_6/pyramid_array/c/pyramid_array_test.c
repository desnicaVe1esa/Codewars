#include <stdbool.h>
#include <stddef.h>
#include <criterion/criterion.h>

int **pyramid (unsigned n);
void free_pyramid (unsigned n, int* pyramid_array[n]);

static void do_test (unsigned n);

Test(tests_suite, sample_tests)
{
	for (int i = 0; i < 4; i++)
		do_test(i);
}

static void do_test (unsigned n)
{
	int **actual = pyramid(n);
	if (n > 0 && actual == NULL)
		cr_assert_not_null(actual, "received a NULL pointer for n = %u", n);

	for (unsigned row = 0; row < n; row++) {
		for (unsigned col = 0; col <= row; col++) {
			if (actual[row][col] != 1) {
				cr_assert_fail("for n = %u, pyramid[%u][%u] was equal to %d",
					n, row, col, actual[row][col]
				);
			}
		}
	}
	free_pyramid(n, actual);
	cr_assert(true);
}