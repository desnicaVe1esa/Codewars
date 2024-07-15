#include <criterion/criterion.h>
#include <stdbool.h>

bool alphanumeric(const char* strin);

Test(the_multiply_function, should_pass_all_the_tests_provided) {
    cr_assert_eq(alphanumeric("hello_world"), false);
    cr_assert_eq(alphanumeric("PassW0rd"),    true);
    cr_assert_eq(alphanumeric("     "),       false);
    cr_assert_eq(alphanumeric("a"),           true);
}