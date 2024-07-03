#include <criterion/criterion.h>
#include <stddef.h>

void do_test (size_t nb_stops, const short bus_stops[nb_stops][2], int expected);

#define sample_test(expected, array) do_test(sizeof(array) / sizeof(array[0]), array, expected)

Test(tests_suite, fixed_tests)
{
  sample_test(5, ((const short[][2]) {{10, 0}, {3, 5}, {5, 8}}));
  sample_test(17, ((const short[][2]) {{3, 0}, {9, 1}, {4, 10}, {12, 2}, {6, 1}, {7, 10}}));
  sample_test(21, ((const short[][2]) {{3, 0}, {9, 1}, {4, 8}, {12, 2}, {6, 1}, {7, 8}}));
  sample_test(0, ((const short[][2]) {{0, 0}}));
}
