#include <criterion/criterion.h>
#include <stdbool.h>

bool IsLeapYear(int);

Test(ExampleTests, Year_2020_is_a_leap_year) {
    cr_assert_eq(IsLeapYear(2020), true, "Incorrect answer for year = 2020");
}

Test(ExampleTests, Year_2000_is_a_leap_year) {
    cr_assert_eq(IsLeapYear(2000), true, "Incorrect answer for year = 2000");
}

Test(ExampleTests, Year_2015_is_not_a_leap_year) {
    cr_assert_eq(IsLeapYear(2015), false, "Incorrect answer for year = 2015");
}

Test(ExampleTests, Year_2100_is_not_a_leap_year) {
    cr_assert_eq(IsLeapYear(2100), false, "Incorrect answer for year = 2100");
}