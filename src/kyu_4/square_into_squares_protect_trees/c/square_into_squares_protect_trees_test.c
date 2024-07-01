#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <criterion/criterion.h>

extern char *decompose(long long n);
static void testing(long long n, const char *reference);

Test(kata, SampleTests) {
    testing(50, "[1,3,5,8,49]");
    testing(44, "[2,3,5,7,43]");
    testing(625, "[2,5,8,34,624]");
    testing(2, "[]"); 
}

typedef unsigned long long ull;

extern bool is_strictly_increasing (size_t length, const ull sequence[length]);
extern ull sum_array_squares (size_t length, const ull array[length]);
extern bool parse_sequence(const char *string, size_t *count_ptr, ull **sequence_ptr);

static void testing(long long n, const char *reference) {
    char *actual = decompose(n);

    if (!strcmp(reference, "[]")) {
        cr_assert_str_eq(actual, reference,
            "for n = %lld, expected \"%s\", but got \"%s\"",
            n, reference, actual
        );
        return;
    }

    size_t count;
    ull *sequence;
    if (!parse_sequence(actual, &count, &sequence)) {
        cr_assert_fail(
            "for n = %lld\nyour solution is ill-formed: should be a "
            "comma-separated list of non-negative numbers, within [],"
            " but got:\n\"%s\""
            , n, actual
        );
    }

    cr_assert(is_strictly_increasing(count, sequence),
        "for n = %lld, your sequence is not strictly-increasing:\n\"%s\"",
        n, actual
    );

    long long sum_of_squares = sum_array_squares(count, sequence);
    cr_assert_eq(sum_of_squares, n * n,
        "for n = %lld, your sequence should add up to n² = %lld, but got %lld\n"
        "your sequence: \"%s\"",
        n, n * n, sum_of_squares, actual
    );

    free(actual);
    free(sequence);
}