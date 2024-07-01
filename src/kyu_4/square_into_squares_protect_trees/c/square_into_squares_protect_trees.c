#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

bool is_square_sum( long long sq, long long k, char* *out )
{
  while( k>0 ) {
    long long s = k*k;
    if ( sq==s || (sq>s && is_square_sum(sq - s, k-1, out)) ) {
      *out += sprintf( *out, "%lld,", k );
      return true;
      }
    k--;
  }
  return false;
}

char* decompose(long long n)
{
  char *ret = calloc(500, sizeof(char) );
  ret[0] = '[';
  char *out = ret+1;
  if ( is_square_sum(n*n, n-1, &out) ) out--;
  *out = ']';
  return ret;
}