#include <criterion/criterion.h>

char *strsum(const char *a, const char *b);

Test(Sample_Test, should_return_the_string_sum)
{
    cr_assert_str_eq(strsum("123" , "456"),"579");
    cr_assert_str_eq(strsum("00001", "9"), "10");
    cr_assert_str_eq(strsum("00000", "0"), "0");
}