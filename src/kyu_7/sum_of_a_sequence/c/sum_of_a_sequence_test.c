#include <criterion/criterion.h>

unsigned sequence_sum(unsigned start, unsigned end, unsigned step);

Test(Sample_Test, should_return_the_sum_of_sequence)
{
    cr_assert_eq(sequence_sum(2u, 6u, 2u), 12u);
    cr_assert_eq(sequence_sum(1u, 5u, 1u), 15u);
    cr_assert_eq(sequence_sum(1u, 5u, 3u), 5u);
    cr_assert_eq(sequence_sum(0u, 15u, 3u), 45u);
    cr_assert_eq(sequence_sum(16u, 15u, 3u), 0u);
}