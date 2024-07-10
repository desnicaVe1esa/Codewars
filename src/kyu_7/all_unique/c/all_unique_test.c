#include <criterion/criterion.h>

bool has_unique_chars(const char *str);

Test(has_unique_chars, test_example) {
    cr_assert_not(has_unique_chars("  nAa"));
    cr_assert(has_unique_chars("abcde"));
    cr_assert_not(has_unique_chars("++-"));
    cr_assert(has_unique_chars("AaBbC"));
}