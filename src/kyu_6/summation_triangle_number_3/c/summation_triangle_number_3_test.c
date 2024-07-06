#include <criterion/criterion.h>
#include <stdlib.h>

long long get_sum(unsigned n);
void tester(unsigned n, long long expected);

Test(get_sum, _1_Small_Tests) {
    tester( 0,   1 );
    tester( 1,  -4 );
    tester( 2,   0 );
    tester( 3, -18 );
    tester( 4,  -9 );
}

Test(get_sum, _2_Medium_Tests) {
    tester(  100,    -127449 );
    tester(  500,  -15687249 );
    tester( 1000, -125249499 );
}

Test(get_sum, _3_Large_Tests) {
    tester(   10000,       -125024994999 );
    tester(  100000,    -125002499949999 );
    tester( 1000000, -125000249999499999 );
}

void tester(unsigned n, long long expected) {
    long long submitted = get_sum(n);
    cr_assert_eq(                               submitted,          expected,
        "< Incorrect Summation >\n \nn = %u\n \nSubmitted: %lld\n \nExpected:  %lld\n \n",
                                     n,         submitted,          expected
    );
}