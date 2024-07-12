#include <stdlib.h>
char* remove(const char* strin, int n)
{
    int i,j;
    char *return_string = calloc(strlen(strin) + 1, 1);
    for(i = 0, j = 0; i < strlen(strin); i++)
    {
        if(strin[i] == '!' && n != 0)
        {
            n--;
        } else
        {
            return_string[j] = strin[i];
            j++;
        }
    }
    return return_string;
}