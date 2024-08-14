#include <stddef.h>
#include <criterion/criterion.h>

extern void do_test (size_t nb_words, const char *const words[nb_words], const short expected[nb_words]);

#define ARR_LEN(array) (sizeof(array) / sizeof *(array))

#define sample_test(words, expected) do_test(ARR_LEN(words), words, expected)

Test(tests_suite, sample_tests)
{
	sample_test(((const char *[])
		{"abode","ABc","xyzD"}),
		((short[]){4, 3, 1})
	);
	sample_test(((const char *[])
		{"abide","ABc","xyz"}),
		((short[]){4, 3, 0})
	);
	sample_test(((const char *[])
		{"IAMDEFANDJKL","thedefgh","xyzDEFghijabc"}),
		((short[]){6, 5, 7})
	);
	sample_test(((const char *[])
		{"encode","abc","xyzD","ABmD"}),
		((short[]){1, 3, 1, 3})
	);
}