#include <stdio.h>
#include <string.h>
#include <stdbool.h>

void dashatize(int number, char string[32])
{
  *string = 0;
  char number_string[42] = { 0 };
  sprintf(number_string, "%d", number);

  char digits[42][3] = { { 0 } };
  for(size_t i = 0; number_string[i]; i++)
  {
    char *recent = digits[i];
    sprintf(recent, "%c", number_string[i]);
    if(i == 0)
    {
      continue;
    }
    char *previous = digits[i - 1];
    if(is_odd(previous) || is_odd(recent))
    {
      strcat(previous, "-");
    }
  }

  for(size_t i = 0; *digits[i]; i++)
  {
    if( digits[i][0] == '-')
    {
      continue;
    }
    strcat(string, digits[i]);
  }
}

bool is_odd(char *a)
{
  return (a[0] - '0') % 2;
}