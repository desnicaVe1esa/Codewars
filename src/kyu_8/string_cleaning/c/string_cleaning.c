char *clean_string (char *string)
{
    char *dest = string;
    char *src = string;

    while (*src)
    {
        if (isdigit(*src))
            {
                src++;
                continue;
            }
        *dest++ = *src++;
    }
    *dest = '\0';
    return string;
}