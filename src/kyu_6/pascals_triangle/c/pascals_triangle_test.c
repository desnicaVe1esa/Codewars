#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <criterion/criterion.h>

extern void pascals_triangle (unsigned n, unsigned triangle[n * (n + 1) / 2]);
static void do_test    (unsigned n, const unsigned expected[n * (n + 1) / 2]);

Test(tests_suite, sample_tests)
{
    do_test(1, (unsigned[]){
        1
    });
    do_test(2, (unsigned[]) {
          1,
        1, 1,
    });
    do_test(4, (unsigned[]) {
             1,
           1, 1,
         1, 2, 1,
        1, 3, 3, 1,
    });
    do_test(6, (unsigned[]) {
                1,
               1, 1,
             1, 2, 1,
            1, 3, 3, 1,
          1, 4, 6,  4, 1,
        1, 5, 10, 10, 5, 1,
    });
}


static void print_triangle (unsigned nb_rows, const unsigned triangle[nb_rows * (nb_rows + 1) / 2])
{
    for (unsigned row = 0; row < nb_rows; row++) {
        for (unsigned column = 0; column <= row; column++)
            printf("%u ", *(triangle++));
        printf("\n");
    }
}

static void do_test (unsigned nb_rows, const unsigned expected[nb_rows * (nb_rows + 1) / 2])
{
    const size_t nb_elems = nb_rows * (nb_rows + 1) / 2;
    const size_t mem_size = nb_elems * sizeof *expected;

// the user could take advantage of the memory being already zeroed, so we memset():
    unsigned *actual = memset(malloc(mem_size), '@', (mem_size));
    pascals_triangle(nb_rows, actual);

    if (memcmp(actual, expected, mem_size)) {
        puts("expected:");
        print_triangle(nb_rows, expected);
        puts("but got:");
        print_triangle(nb_rows, actual);
        fflush(stdout);
    }
    cr_assert_arr_eq(actual, expected, mem_size, "for n = %u", nb_rows);
    free(actual);
}