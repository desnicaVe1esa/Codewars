#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <criterion/criterion.h>

extern void josephus_permutation (size_t n, int permuted[n], const int array[n], size_t k);

#define ARR_LEN(array) (sizeof(array) / sizeof *(array))

#define fixed_test(k, input, expected) do_test(k, ARR_LEN(input), input, expected)

static void do_test (size_t k, size_t n, const int input[n], const int expected[n]);

Test(tests_suite, sample_tests)
{
	const int xs[7] = {1, 2, 3, 4, 5, 6, 7};

	fixed_test(  1, xs, ((int[]){1, 2, 3, 4, 5, 6, 7}));
	fixed_test(  2, xs, ((int[]){2, 4, 6, 1, 5, 3, 7}));
	fixed_test(  3, xs, ((int[]){3, 6, 2, 7, 5, 1, 4}));
	fixed_test(  4, xs, ((int[]){4, 1, 6, 5, 7, 3, 2}));
	fixed_test(  5, xs, ((int[]){5, 3, 2, 4, 7, 1, 6}));
	fixed_test(  6, xs, ((int[]){6, 5, 7, 2, 1, 4, 3}));
	fixed_test(  7, xs, ((int[]){7, 1, 3, 6, 2, 4, 5}));
	fixed_test(  8, xs, ((int[]){1, 3, 6, 5, 2, 7, 4}));
	fixed_test(  9, xs, ((int[]){2, 5, 3, 4, 1, 6, 7}));
	fixed_test( 10, xs, ((int[]){3, 7, 6, 2, 4, 1, 5}));
	fixed_test(421, xs, ((int[]){1, 2, 3, 4, 5, 6, 7}));

  fixed_test(3, ((int[]){1}), ((int[]){1}));

	fixed_test(1, ((int[])
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), ((int[])
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
	));
	fixed_test(2, ((int[])
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), ((int[])
		{2, 4, 6, 8, 10, 3, 7, 1, 9, 5}
	));
	do_test(5, 0, NULL, NULL);
}

static void print_array (size_t length, const int array[length])
{
	printf("{");
	for (size_t i = 0; i < length; i++)
		printf("%d%s", array[i], (i == (length - 1)) ? "" : ", ");
	printf("}");
}

static void do_test (size_t k, size_t n, const int input[n], const int expected[n])
{
	const size_t size = n * sizeof *input;
	int *actual = malloc(size);
	josephus_permutation(n, actual, input, k);

	if (memcmp(actual, expected, size)) {
		puts("for array:");
		print_array(n, input);
		puts("\nexpected:");
		print_array(n, expected);
		puts("\nbut got:");
		print_array(n, actual);
		fflush(stdout);
	}
	cr_assert_arr_eq(actual, expected, size,
		"for k = %zu", k
	);
	free(actual);
}