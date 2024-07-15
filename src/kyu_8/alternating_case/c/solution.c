#include <stdio.h>
#include <ctype.h>

char *to_alternating_case(const char *str) {
    int len = strlen(str);
    char  * result = malloc(len + 1); // Выделяем память для новой строки
    if (!result) {
        perror("malloc failed");
        return NULL;
    }

    for (int i = 0; i < len; ++i) {
        if (islower(str[i])) {
            result[i] = toupper(str[i]);
        } else if (isupper(str[i])) {
            result[i] = tolower(str[i]);
        } else {
            result[i] = str[i]; // Небуквенные символы остаются без изменений
        }
    }
    result[len] = '\0'; // Добавляем нулевой символ в конец строки

    return result;
}