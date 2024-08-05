#include <criterion/criterion.h>

int minSum(int passed[], int passed_size);

Test(minSum, return_minimum_Sum_Of_Numbers) {
    cr_assert_eq(minSum((int[]){5,4,2,3}, 4), 22);
    cr_assert_eq(minSum((int[]){12,6,10,26,3,24}, 6), 342);
    cr_assert_eq(minSum((int[]){9,2,8,7,5,4,0,6}, 8), 74);
}