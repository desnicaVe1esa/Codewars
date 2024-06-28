#include <stdio.h>
#include <criterion/criterion.h>

extern int mxdiflg(
	const char *const arr_1[], size_t len_1,
	const char *const arr_2[], size_t len_2
);

static void do_test (int expected,
	size_t len_1, const char *const arr_1[len_1],
	size_t len_2, const char *const arr_2[len_1]
);

#define ARR_LEN(array) (sizeof(array) / sizeof *(array))

Test(TestsSuite, SampleTests)
{
	{
		const char *arr_1[] = { "hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz" };
		const char *arr_2[] = { "cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww" };
		do_test(13, ARR_LEN(arr_1), arr_1, ARR_LEN(arr_2), arr_2);
	}
	{
		const char *arr_1[] = { "ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh" };
		const char *arr_2[] = { "bbbaaayddqbbrrrv" };
		do_test(10, ARR_LEN(arr_1), arr_1, ARR_LEN(arr_2), arr_2);
	}
	{
		const char *arr_1[] = { "ccct", "tkkeeeyy", "ggiikffsszzoo", "nnngssddu", "rrllccqqqqwuuurdd", "kkbbddaakkk" };
		const char *arr_2[] = { "tttxxxxxxgiiyyy", "ooorcvvj", "yzzzhhhfffaaavvvpp", "jjvvvqqllgaaannn", "tttooo", "qmmzzbhhbb" };
		do_test(14, ARR_LEN(arr_1), arr_1, ARR_LEN(arr_2), arr_2);
	}
	{
		const char **arr_1 = NULL;
		const char *arr_2[] = { "cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww" };
		do_test(-1, 0, arr_1, ARR_LEN(arr_2), arr_2);
	}
	{
		const char *arr_1[] = { "cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww" };
		const char **arr_2 = NULL;
		do_test(-1, ARR_LEN(arr_1), arr_1, 0, arr_2);
	}
	{
		const char **arr_1 = NULL;
		const char **arr_2 = NULL;
		do_test(-1, 0, arr_1, 0, arr_2);
	}
}

static void print_array (size_t len, const char *const array[len])
{
	printf("{");
	for (size_t i = 0; i < len; i++)
		printf("\"%s\"%s", array[i], (i == len - 1) ? "" : ", ");
	printf("}");
}

static void do_test (int expected,
	size_t len_1, const char *const arr_1[len_1],
	size_t len_2, const char *const arr_2[len_1]
)
{
	int actual = mxdiflg(arr_1, len_1, arr_2, len_2);

	if (actual != expected) {
		printf("array 1 = ");
		print_array(len_1, arr_1);
		printf("\narray 2 = ");
		print_array(len_2, arr_2);
		fflush(stdout);
	}
	cr_assert_eq(actual, expected,
		"expected %d, but got %d",
		expected, actual
	);
}