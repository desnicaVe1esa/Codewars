#include <stdint.h>
#include <string>

int digits(uint64_t n) {
  return std::to_string(n).length();
}
