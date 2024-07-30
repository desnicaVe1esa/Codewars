#include <criterion/criterion.h>

#include <stdbool.h>
#include <stddef.h>

typedef bool (*Predicate)(int);

bool all(int* arr, size_t size, Predicate fun);

bool greater_than_9(int x) {
  return x > 9;
}

bool less_than_9(int x) {
  return x < 9;
}

Test(basic_tests, should_pass_all_the_tests_provided) {
    int arr[] = { 1, 2, 3, 4, 5 };
    size_t size = 5;
    
    cr_assert_eq(all(arr, size, &less_than_9), true);
    cr_assert_eq(all(arr, size, &greater_than_9), false);
}