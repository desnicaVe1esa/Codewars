#include <stdlib.h>

 int **pyramid (unsigned n){
     int **ret;
     if (n == 0)
         return NULL;
     ret = (int**)calloc(n, sizeof(int*));

     for (unsigned int i = 0; i < n; i++) {
         ret[i] = (int*)calloc(i + 1, sizeof(int));
         for (unsigned int j = 0; j <= i; j++) {
             ret[i][j] = 1;
         }
     }
     return ret;
 }

 void free_pyramid (unsigned n, int* pyramid_array[n]) {
     for (unsigned int i = 0; i < n; i++) {
         free(pyramid_array[i]);
     }
     free(pyramid_array);
 }