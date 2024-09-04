#include <criterion/criterion.h>

void tester(size_t address, size_t street, size_t expected);

Test(Example_Tests, should_pass_all_the_tests_provided)
{
    tester( 1,  3,  6 );
    tester( 3,  3,  4 );
    tester( 2,  3,  5 );
    tester( 3,  5,  8 );
    tester( 7, 11, 16 );
}