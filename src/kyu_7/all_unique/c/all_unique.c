#include <stdbool.h>
#include <string.h>

bool has_unique_chars(const char *str) 
{
    char c, tab[128] = { 0 };
    while (c = *str++)
    {
        if (tab[c]++)
        {
           return false;
        }
    }
    return true;
}
