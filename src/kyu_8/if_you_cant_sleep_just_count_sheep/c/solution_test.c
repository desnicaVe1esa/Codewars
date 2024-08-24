#include <stdlib.h>
#include <criterion/criterion.h>

static void do_test (unsigned n, const char *expected);

Test(tests_suite, sample_tests)
{
  do_test(0, "");
  do_test(1, "1 sheep...");
  do_test(2, "1 sheep...2 sheep...");
  do_test(12,
    "1 sheep...2 sheep...3 sheep...4 sheep...5 sheep..."
    "6 sheep...7 sheep...8 sheep...9 sheep..."
    "10 sheep...11 sheep...12 sheep..."
  );
}

extern char *count_sheep(unsigned n);

static void do_test (unsigned n, const char *expected)
{
  char *actual = count_sheep(n);
  cr_assert_str_eq(actual, expected,
    "for n = %u, expected:\n\"%s\"\nbut got:\n\"%s\"",
    n, expected, actual
  );
  free(actual);
}