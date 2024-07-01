1
#include <stdio.h>#include <criterion/criterion.h>4
long long next_smaller_number(unsigned long long n);static void dotest(unsigned long long n, long long expected);7Test(the_multiply_function, should_pass_all_the_tests_provided) {    dotest(  21,  12);    dotest( 907, 790);    dotest( 531, 513);    dotest(1027,  -1);    dotest( 441, 414);    dotest(123456798, 123456789);}17
static void dotest(unsigned long long n, long long expected) {