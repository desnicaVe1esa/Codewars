#include <criterion/criterion.h>

int multiply(int number);
void tester(int number, int expected);

Test(multiply, Sample_Tests)
{
    tester(   3,    15 );
    tester(  10,   250 );
    tester( 200, 25000 );
    tester(   0,     0 );
    tester(  -3,   -15 );
}

void tester(int number, int expected) {
    int submitted = multiply(number);
    cr_assert_eq(                                 submitted,     expected,
        "< Incorrect Result >\n \nnumber = %d\n \nSubmitted: %d\nExpected:  %d",
                                  number,         submitted,     expected
    );
}