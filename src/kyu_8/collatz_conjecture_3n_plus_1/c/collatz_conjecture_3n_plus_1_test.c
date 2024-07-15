#include <criterion/criterion.h>

unsigned hotpo(unsigned n);
void tester(unsigned n, unsigned expected);

Test(hotpo, Sample_Tests)
{
    tester(  1,  0 );
    tester(  5,  5 );
    tester(  6,  8 );
    tester( 23, 15 );
}

void tester(unsigned n, unsigned expected) {
    unsigned submitted = hotpo(n);
    cr_assert_eq(                            submitted,     expected,
        "< Incorrect Result >\n \nn = %u\n \nSubmitted: %u\nExpected:  %u\n \n",
                                  n,         submitted,     expected
    );
}