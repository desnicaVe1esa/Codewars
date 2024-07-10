#include <criterion/criterion.h>
#include <stdio.h>

int sum_no_duplicates(size_t length, const int array[length]);
void tester(size_t length, const int array[length], int expected);

Test(sum_no_duplicates, Sample_Tests) {
  {
    const int array[4] = {1, 1, 2, 3};
    tester(4, array, 5);
  }
  {
    const int array[5] = {1, 1, 2, 2, 3};
    tester(5, array, 3);
  }
}

void tester(size_t length, const int array[length], int expected) {
    int submitted = sum_no_duplicates(length, array);
    if(submitted != expected) {
        char arr_str[4 * length + 1];
        size_t i = 0, pos = sprintf(arr_str, "{");
        while(i < length)
            pos += sprintf(arr_str + pos, "%d, ", array[i++]);
        sprintf(arr_str + pos - 2, "}");
        cr_assert_fail(
            "< Incorrect Result >\n \narray = %s\n \nSubmitted: %d\nExpected:  %d\n \n",
                                      arr_str,       submitted,     expected
        );
    }
    cr_assert(1);
}