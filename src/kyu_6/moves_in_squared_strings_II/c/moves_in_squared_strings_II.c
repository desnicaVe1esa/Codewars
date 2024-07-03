#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char *rot(char* strng) {
    return strrev(strng);
}
char* selfieAndRot(char* strng) {
    int l = strlen(strng);
    char* s = (char*)malloc(sizeof(char) * (4 * l + 1));
    *s = '\0';
    char* res = s;
    int j = 0; int i;
    for(i = 0; i < l; i++) {
        if(strng[i] == '\n') {
            strncat(s, strng + j, i - j);
            strcat(s, plusDot(i -j));
            j = i + 1;
        }
    }
    strncat(s, strng + j, i -j);
    strcat(s, plusDot(i -j));
    char* t = malloc(sizeof(char) * (strlen(s) + 1));
    strncpy(t, s, strlen(s) - 1);
    t[strlen(s) - 1] = '\0';
    strcat(s, rot(t));
    free(t);
    return res;
}
typedef char* (*generic_func_t) (char*);
char* oper(generic_func_t f, char* s) {
    return f(s);
}