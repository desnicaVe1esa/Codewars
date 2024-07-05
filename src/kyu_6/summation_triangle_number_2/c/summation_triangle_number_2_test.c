#include <criterion/criterion.h>
#include <stdlib.h>

long long get_sum(unsigned n);
void tester(unsigned n, long long expected);

Test(get_sum, _1_Small_Tests) {
    tester( 0,   1 );
    tester( 1,  -5 );
    tester( 2,  10 );
    tester( 3, -18 );
}

Test(get_sum, _2_Medium_Tests) {
    tester(  100,   10251 );
    tester(  500,  251251 );
    tester( 1000, 1002501 );
}

Test(get_sum, _3_Large_Tests) {
    tester(   10000,     100025001 );
    tester(  100000,   10000250001 );
    tester( 1000000, 1000002500001 );
}

void tester(unsigned n, long long expected) {
    long long submitted = get_sum(n);
    cr_assert_eq(                               submitted,          expected,
        "< Incorrect Summation >\n \nn = %u\n \nSubmitted: %lld\n \nExpected:  %lld\n \n",
                                     n,         submitted,          expected
    );
}