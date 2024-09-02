#include <stddef.h>
void josephus_permutation (size_t z, int permuted[z], int array[z], size_t k)
{
  if (!z)return;
  int* arr = calloc(z, sizeof(int));
  memcpy(arr, array,z*sizeof(int));
  int b = (k-1) % z,i=0;
  while (z) {
    permuted[i++] = arr[b];
    for (int j = b ; j < z-1 ; j++)arr[j]=arr[j+1];
    z--;
    if (!z)return;
    b = (b+k-1) % z;
  }
}