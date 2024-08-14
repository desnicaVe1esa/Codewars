#include <stdlib.h>

int *race(int v1, int v2, int g)
{
        int* result = (int*) malloc(3 * sizeof(int));
        if (v1 > v2)
        {
            result[0] = -1;
            result[1] = -1;
            result[2] = -1;
            return result;
        }
        int closingTime =  (g * 3600) / (v2 - v1);
        result[0] = closingTime / 3600;
        result[1] = (closingTime % 3600) / 60;
        result[2] = closingTime % 60;
        return result;
}