#include <criterion/criterion.h>

extern void do_test (const char *digits, const char *expected);

Test(tests_suite, sample_tests)
{
  do_test("", "");
  do_test("0", "");
  do_test("1", "1");
  do_test("2", "22");
  do_test("3", "333");
  do_test("4", "4444");
  do_test("5", "55555");
  do_test("6", "666666");
  do_test("7", "7777777");
  do_test("8", "88888888");
  do_test("9", "999999999");
  do_test("000", "");
  do_test("312", "333122");
  do_test("102269","12222666666999999999");
}