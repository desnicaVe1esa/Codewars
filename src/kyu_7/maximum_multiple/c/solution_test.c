#include <criterion/criterion.h>

int maxMultiple(int divisor, int bound);

Test(Maximum_Multiple, Check_Small_Positives)
{
    cr_assert_eq(maxMultiple(2,7),   6);
    cr_assert_eq(maxMultiple(3,10),  9);
    cr_assert_eq(maxMultiple(7,17), 14);
}
Test(Maximum_Multiple, Larger_Positives)
{
    cr_assert_eq(maxMultiple(10,50),   50);
    cr_assert_eq(maxMultiple(37,200), 185);
    cr_assert_eq(maxMultiple(7,100),   98);
}