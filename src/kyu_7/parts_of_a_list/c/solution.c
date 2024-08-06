#include <stdlib.h>
#include <assert.h>
typedef struct Pair Pair;
struct Pair {
    char* first;
    char* snd;
};
Pair** partlist(char** arr, int sz) {

Pair** ret = (Pair**) malloc(sizeof(Pair*) * (sz - 1));
  assert(ret);
  for (int i = 0; i< sz - 1; i++) {
    ret[i] = malloc(sizeof(Pair));
    ret[i]->first = malloc(1024);
    ret[i]->snd = malloc(1024);
    int pos = 0;
    for (int j = 0; j < i + 1; j++) {
      pos += sprintf(ret[i]->first + pos, "%s ", arr[j]);
    }
    ret[i]->first[pos-1] = '\0';

    pos = 0;
    for (int j = i + 1; j < sz; j++) {
      pos += sprintf(ret[i]->snd + pos, "%s ", arr[j]);
    }
    ret[i]->snd[pos-1] = '\0';
  }
  return ret;
  // your code
}