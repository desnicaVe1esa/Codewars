#include <stdlib.h>
#include <criterion/criterion.h>

static void do_test (int v1, int v2, int g, const int expected[3]);

Test(tests_suite, fixed_tests) {
    do_test(720, 850, 70, (int[]) {0, 32, 18});
    do_test(820, 81, 550, (int[]) {-1, -1, -1});
    do_test(80, 91, 37, (int[]) {3, 21, 49});
    do_test(80, 100, 40, (int[]) {2, 0, 0});
    do_test(720, 850, 37, (int[]) {0, 17, 4});
    do_test(720, 850, 370, (int[]) {2, 50, 46});
    do_test(120, 850, 37, (int[]) {0, 3, 2});
    do_test(820, 850, 550, (int[]) {18, 20, 0});
    do_test(82, 50, 55, (int[]) {-1, -1, -1});
}

extern int *race(int v1, int v2, int g);

static void do_test (int v1, int v2, int g, const int expected[3]) {
    int *actual = race(v1, v2, g);
    cr_assert_arr_eq(actual, expected, 3 * sizeof *expected,
        "for v1 = %d, v2 = %d, g = %d\n"
        "expected { %d, %d, %d }, but got { %d, %d, %d }",
        v1, v2, g,
        expected[0], expected[1], expected[2],
        actual  [0], actual  [1], actual  [2]
    );
    free(actual);
}