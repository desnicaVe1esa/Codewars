#include <ctype.h>
#include <stddef.h>

void alphabet_positions (size_t n, const char *const words[n], short positions[n])
{
  while(n--){
    positions[n]=0;

    int ch='a';
    const char *p=words[n];

    while(*p && positions[n]<=26){
      positions[n]+=(tolower(*p++)==ch++);
    }
  }
}