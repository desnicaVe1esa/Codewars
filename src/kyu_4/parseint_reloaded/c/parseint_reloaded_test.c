#include <criterion/criterion.h>

long parse_int (const char* number);

void shouldBe (const char *number, long expected) {
  long result = parse_int (number);
  cr_assert_eq (result, expected, "While parsing '%s' expected %ld, got %ld instead", number, expected, result);
}

Test (parseint, sample) {
    shouldBe ("one", 1);
    shouldBe ("twenty", 20);
    shouldBe ("two hundred and forty-six", 246);
}