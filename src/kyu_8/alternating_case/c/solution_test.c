#include <criterion/criterion.h>

char *to_alternating_case(const char *);

Test(to_alternating_case, should_work_for_all_fixed_assertions_provided_in_kata_description) {
  cr_assert_str_eq(to_alternating_case("hello world"), "HELLO WORLD");
  cr_assert_str_eq(to_alternating_case("HELLO WORLD"), "hello world");
  cr_assert_str_eq(to_alternating_case("hello WORLD"), "HELLO world");
  cr_assert_str_eq(to_alternating_case("HeLLo WoRLD"), "hEllO wOrld");
  cr_assert_str_eq(to_alternating_case("12345"), "12345");
  cr_assert_str_eq(to_alternating_case("1a2b3c4d5e"), "1A2B3C4D5E");
  cr_assert_str_eq(to_alternating_case("String.prototype.toAlternatingCase"), "sTRING.PROTOTYPE.TOaLTERNATINGcASE");
}