#include <stddef.h>

int sum_no_duplicates(size_t length, const int array[length]) {

  int sum = 0;

  for (int i = 0; i < length; i++) {
    int count = 0;

    for (int j = 0; j < length; j++) {
      if ((array[j] == array[i]) && i !=j) count++;
    }

    if (!count) sum += array[i];
  }
  return sum;

}