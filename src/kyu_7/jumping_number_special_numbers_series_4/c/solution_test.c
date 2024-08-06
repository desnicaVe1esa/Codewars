#include <criterion/criterion.h>

const char *jumpingNumber(int number);

Test(Jumping_Number, Single_Digit_Number)
{
    cr_assert_str_eq(jumpingNumber(9), "Jumping!!");
    cr_assert_str_eq(jumpingNumber(1), "Jumping!!");
    cr_assert_str_eq(jumpingNumber(7), "Jumping!!");
}
Test(Jumping_Number, Two_Digit_Number)
{
    cr_assert_str_eq(jumpingNumber(23), "Jumping!!");
    cr_assert_str_eq(jumpingNumber(32), "Jumping!!");
    cr_assert_str_eq(jumpingNumber(79), "Not!!");
    cr_assert_str_eq(jumpingNumber(98), "Jumping!!");
}
Test(Jumping_Number, Larger_Numbers)
{
    cr_assert_str_eq(jumpingNumber(8987), "Jumping!!");
    cr_assert_str_eq(jumpingNumber(4343456), "Jumping!!");
    cr_assert_str_eq(jumpingNumber(98789876), "Jumping!!");
}