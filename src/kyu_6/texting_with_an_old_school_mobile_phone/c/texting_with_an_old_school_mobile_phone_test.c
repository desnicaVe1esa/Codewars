#include <criterion/criterion.h>
#include <string.h>
#include <stdlib.h>
#include <stdio.h>

char* send_message(const char*);

Test(basic_tests, should_pass_all_the_tests) {
  const char* inputs[]   = {"hey",     "one two three",              "Hello World!",                       "Def Con 1!",                   "A-z",       "1984",     "Big thanks for checking out my kata"};
  const char* expected[] = {"4433999", "666 6633089666084477733 33", "#44#33555 5556660#9#66677755531111", "#3#33 3330#222#666 6601-1111", "#2**#9999", "1-9-8-4-", "#22#444 4084426655777703336667770222443322255444664066688 806999055282"};

  for (size_t i = 0; i < sizeof(inputs) / sizeof(char*); i++) {
    char* actual = send_message(inputs[i]);
    cr_assert_str_eq(actual, expected[i], "Testing message: `%s`\nExpected: \"%s\"\nSubmitted: \"%s\"\n", inputs[i], expected[i], actual);
    free(actual);
  }
}