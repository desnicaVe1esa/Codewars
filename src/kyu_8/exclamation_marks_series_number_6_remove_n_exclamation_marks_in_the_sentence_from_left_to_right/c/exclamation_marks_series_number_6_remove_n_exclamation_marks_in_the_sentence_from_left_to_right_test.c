#include <criterion/criterion.h>

char *remove(const char *str_in, int n);

Test(Sample_Tests, should_remove_n_exclamation_points)
{
    cr_assert_str_eq(remove("Hi!!!",               1), "Hi!!");
    cr_assert_str_eq(remove("Hi!!!",             100), "Hi");
    cr_assert_str_eq(remove("!!!Hi !!hi!!! !hi",   5), "Hi hi!!! !hi");
}