#include <assert.h>  // assert
#include <stdlib.h>  // malloc
#include <string.h>  // size_t, strdup, strlen

size_t get_sum_of_cubes_of_digits(const char *s, size_t len) {
  size_t res = 0;
  for (size_t i = 0; i < len; ++i) {
    assert('0' <= s[i] && s[i] <= '9');
    size_t digit = s[i] - '0';
    res += digit * digit * digit;
  }
  return res;
}

void reverse(char *res, const char *s, size_t len) {
  for (size_t i = 0; i < len; ++i) {
    res[len - 1 - i] = s[i];
  }
}

void rotate(char *res, const char *s, size_t len) {
  for (size_t i = 0; i < len; ++i) {
    res[(i + len - 1) % len] = s[i];
  }
}

char *revrot(char* s, int sz) {
  size_t len = strlen(s);
  if (sz <= 0 || (unsigned) sz > len) {
    return strdup("");
  }

  size_t res_len = len - len % sz;
  char *res = malloc(res_len + 1);
  if (!res) {
    return NULL;
  }
  for (size_t i = 0; i < res_len; i += sz) {
    if (get_sum_of_cubes_of_digits(s + i, sz) % 2 == 0) {
      reverse(res + i, s + i, sz);
    } else {
      rotate(res + i, s + i, sz);
    }
  }
  res[res_len] = '\0';
  return res;
}