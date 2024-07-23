#include <stdio.h>
#include <criterion/criterion.h>

extern void twoSum(unsigned count, const int numbers[count], int target, unsigned *index1, unsigned *index2);

#define ARR_LEN(array) ( sizeof(array) / sizeof *(array) )

static void doTest(unsigned count, const int numbers[count], const int expected[2]);

Test(Two_Sum, Sample_Tests)
{
    {
        int numbers[] = {2, 1, 3}, expected[] = {1, 2};
        doTest(ARR_LEN(numbers), numbers, expected);
    }
    {
        int numbers[] = {1,2,3}, expected[] = {0,2};
        doTest(ARR_LEN(numbers), numbers, expected);
    }
    {
        int numbers[] = {1234,5678,9012}, expected[] = {1,2};
        doTest(ARR_LEN(numbers), numbers, expected);
    }
    {
        int numbers[] = {2,2,3}, expected[] = {0,1};
        doTest(ARR_LEN(numbers), numbers, expected);
    }
}

static void printArray(size_t length, const int array[length])
{
	printf("{");
	for (size_t i = 0; i < length; i++)
		printf("%d%s", array[i], (i == length - 1) ? "" : ", ");
	printf("}");
}

static void doTest(unsigned count, const int numbers[count], const int expected[2])
{
	int target = numbers[expected[0]] + numbers[expected[1]];
	unsigned index1 = 666, index2 = 666;
	twoSum(count, numbers, target, &index1, &index2);

	if (index1 >= count || index2 >= count)
		cr_assert_fail("you returned indices larger than or equal to the array length");

	cr_assert_neq(index1, index2,
		"the two indices must be different, but got (%u, %u)",
		index1, index2
	);

	int actual = numbers[index1] + numbers[index2];
	if (actual != target) {
		printf("array = ");
		printArray(count, numbers);
		fflush(stdout);
	}

	cr_assert_eq(actual, target,
		"numbers[%u] (%d) + numbers[%u] (%d) == %d, but target was %d",
		index1, numbers[index1], index2, numbers[index2], actual, target
	);
}