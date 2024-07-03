#include <ctype.h>
#include <stdio.h>

void vaporcode(const char *src, char *dst)
{
    while (*src == ' ')
    {
        src++;
    }

    *dst++ = toupper(*src++);

    while (*src)
    {
        if (*src != ' ')
        {
            *dst++ = ' '; *dst++ = ' '; *dst++ = toupper(*src);
        }
        src++;
    }

    *dst = '\0';
}
