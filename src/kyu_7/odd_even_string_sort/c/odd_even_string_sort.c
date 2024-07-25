#include <string.h>

char *sortMyString(const char *s)
{
    char *str = (char *)malloc(strlen(s) + 2 * sizeof(char));

    int x = 0, index = 0;

    for(x = 0; x < strlen(s); x += 2) str[index++] = s[x];
    str[index++] = 32;
    for(x = 1; x < strlen(s); x += 2) str[index++] = s[x];
    str[index] = 0;


    return str;
}