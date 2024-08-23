#include <string.h>
#include <stdlib.h>
#include <criterion/criterion.h>

extern char *clean_string (char *string);
static void do_test (const char *input, const char *expected);

Test(tests_suite, sample_tests)
{
  do_test("", "");
  do_test("! !", "! !");
  do_test("123456789", "");
  do_test("(E3at m2e2!!)", "(Eat me!!)");
  do_test("Dsa32 cdsc34232 csa!!! 1I 4Am cool!", "Dsa cdsc csa!!! I Am cool!");
  do_test("A1 A1! AAA   3J4K5L@!!!", "A A! AAA   JKL@!!!");
  do_test("Adgre2321 A1sad! A2A3A4 fv3fdv3J544K5L@", "Adgre Asad! AAA fvfdvJKL@");
  do_test("Ad2dsad3ds21 A  1$$s122ad! A2A3Ae24 f44K5L@222222 ", "Addsadds A  $$sad! AAAe fKL@ ");
  do_test("33333Ad2dsad3ds21 A3333  1$$s122a!d! A2!A!3Ae$24 f2##222 ", "Addsadds A  $$sa!d! A!A!Ae$ f## ");
  do_test("My \"me3ssy\" d8ata issues2! Will1 th4ey ever, e3ver be3 so0lved?", "My \"messy\" data issues! Will they ever, ever be solved?");
  do_test("Wh7y can't we3 bu1y the goo0d software3? #cheapskates3", "Why can't we buy the good software? #cheapskates");
}

static void do_test (const char *input, const char *expected)
{
  extern char *strdup(const char *);
  char *user_string = strdup(input);
  char *actual = clean_string(user_string);

  if (actual != user_string)
    cr_assert_fail("you must return the given string");

  cr_assert_str_eq(actual, expected,
    "for string:\n\"%s\"\nexpected:\n\"%s\"\nbut got:\n\"%s\"",
    input, expected, actual
  );
  free(user_string);
}