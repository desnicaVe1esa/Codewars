#include <criterion/criterion.h>

void vaporcode(const char *, char *);

Test(Sample_tests, Tests)
{
  {
    const char a[] = "Let's go to the movies";
    char b[53];
    vaporcode(a, b);
    cr_assert_str_eq(b, "L  E  T  '  S  G  O  T  O  T  H  E  M  O  V  I  E  S");
  }
  {
    const char a[] = "Why isn't my code working?";
    char b[65];
    vaporcode(a, b);
    cr_assert_str_eq(b, "W  H  Y  I  S  N  '  T  M  Y  C  O  D  E  W  O  R  K  I  N  G  ?");
  }
}