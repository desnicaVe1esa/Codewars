#include <stdint.h>

unsigned digits(uint64_t n) {
  unsigned res = 1;
  while (n >= 10) {
    res++;
    n /= 10;
  }
  return res;
}