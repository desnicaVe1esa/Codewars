char* remove_bang(char* s)
{
    int wPos = 0;
    char *sOut = malloc(strlen(s) * sizeof(char));
    while(*s != '\0'){
       if(*s != '!')
          sOut[wPos++] = *s;
       s++;
    }
    sOut[wPos++] = '!';
    sOut[wPos]   = '\0';
    return sOut;
}