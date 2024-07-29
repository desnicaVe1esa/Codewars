#include <stdio.h>
#include <stdlib.h>

int close_compare(int a, int b, int margin)
{
   return abs(a - b) <= margin ? 0 : a < b ? -1 : 1;
};