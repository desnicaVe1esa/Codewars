#include <criterion/criterion.h>

int maxTriSum(int numbers[], int count);

void doTest(int numbers[], int count, int expected)
{
    cr_assert_eq(maxTriSum(numbers, count), expected);
}

#define ASIZE(a) (sizeof(a) / sizeof((a)[0]))

Test(Maximum_Triplet_Sum, Check_Positive_Values)
{
    {
        int a[] = {3,2,6,8,2,3}, exp = 17;
        doTest(a, ASIZE(a), exp);
    }
    {
        int a[] = {2,9,13,10,5,2,9,5}, exp = 32;
        doTest(a, ASIZE(a), exp);
    }
    {
        int a[] = {2,1,8,0,6,4,8,6,2,4}, exp = 18;
        doTest(a, ASIZE(a), exp);
    }
}
Test(Maximum_Triplet_Sum, Check_Negative_Values)
{
    {
        int a[] = {-3,-27,-4,-2,-27,-2}, exp = -9;
        doTest(a, ASIZE(a), exp);
    }
    {
        int a[] = {-14,-12,-7,-42,-809,-14,-12}, exp = -33;
        doTest(a, ASIZE(a), exp);
    }
}
Test(Maximum_Triplet_Sum, Check_Mixture_Values)
{
    {
        int a[] = {-13,-50,57,13,67,-13,57,108,67}, exp = 232;
        doTest(a, ASIZE(a), exp);
    }
    {
        int a[] = {-7,12,-7,29,-5,0,-7,0,0,29}, exp = 41;
        doTest(a, ASIZE(a), exp);
    }
}