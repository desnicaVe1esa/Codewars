#include <stdbool.h>

bool alphanumeric(const char* strin) {
  if (*strin == '\0')
  {
    return false;
  }
  while (*strin)
  {
    if (!isalnum(*strin++))
    {
      return false;
    }
   }
  return true;
}