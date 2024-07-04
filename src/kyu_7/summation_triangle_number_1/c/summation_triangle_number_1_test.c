#include <criterion/criterion.h>

unsigned long long get_sum(unsigned n);
void tester(unsigned n, unsigned long long expected);

Test(get_sum, Sample_Tests)
{
    tester( 0,  1 );
    tester( 1,  7 );
    tester( 2, 22 );
    tester( 3, 50 );
}

void tester(unsigned n, unsigned long long expected) {
    unsigned long long submitted = get_sum(n);
    cr_assert_eq(                               submitted,          expected,
        "< Incorrect Summation >\n \nn = %u\n \nSubmitted: %llu\n \nExpected:  %llu\n \n",
                                     n,         submitted,          expected
    );
}