#include <criterion/criterion.h>
#include <stdlib.h>

void tester(const char *t_str, char *expected);

Test(Example_Tests, should_pass_these_two_tests)
{
    tester("hello world", "h e l l o   w o r l d");
    tester("12345", "1 2 3 4 5");
}