#include <criterion/criterion.h>

double calculate (const char *expression);

void shouldBe (const char *input, double expected) {
  double result = calculate (input);
  cr_assert_eq (result, expected, "calculate (%s) should be %.18g, got %.18g\n", input, expected, result);
}

Test (MathEvaluator_Tests, Fixed_Tests) {
  shouldBe ("12*-1", -12.);
  shouldBe ("1+1", 2.);
  shouldBe ("1 - 1", 0.);
  shouldBe ("1* 1", 1.);
  shouldBe ("1 /1", 1.);
  shouldBe ("-123", -123.);
  shouldBe ("123", 123.);
  shouldBe ("2 /2+3 * 4.75- -6", 21.25);
  shouldBe ("12* 123", 1476.);
  shouldBe ("2 / (2 + 3) * 4.33 - -6", 7.732);
}