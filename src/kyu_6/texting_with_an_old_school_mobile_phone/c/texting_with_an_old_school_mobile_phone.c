#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

char buttons[10][4] =
{
    ".,?!", "abc/", "def/",
    "ghi/", "jkl/", "mno/",
    "pqrs", "tuv/", "wxyz",
    "'-+="
};

int* findLet(char let)
{
    static int pos[2];
    for (int x = 0; x < 10; x++)
        for (int y = 0; y < 4; y++)
            if (buttons[x][y] == let)
            {
                pos[0] = x + 1;
                pos[1] = y + 1;
                return pos;
            }
}

char* send_message(const char* message)
{
    char* result = malloc(sizeof(char) * strlen(message) * 4 + 1);
    int resultCounter = 0;
    int* currentLet = malloc(sizeof(int) * 2);
    bool isUpperCase = false;

    for (int i = 0; message[i] != '\0'; i++)
    {
        if(message[i] == ' ')
        {
            if (result[resultCounter - 1] == '0')
                result[resultCounter++] = ' ';
            result[resultCounter++] = '0';
        }
        else if (message[i] > 47 && message[i] < 58 || message[i] == '*' || message[i] == '#')
        {
            if (message[i] == result[resultCounter - 1])
                result[resultCounter++] = ' ';
            result[resultCounter++] = message[i];
            result[resultCounter++] = '-';
        }
        else
        {
            if (message[i] > 64 && message[i] < 91)
            {
                currentLet = findLet(message[i] + 32);
                if (isUpperCase == false)
                {
                    result[resultCounter++] = '#';
                    isUpperCase = true;
                }
            }
            else
            {
                currentLet = findLet(message[i]);
                if (isUpperCase == true && currentLet[0] < 10 && currentLet[0] > 1)
                {
                    result[resultCounter++] = '#';
                    isUpperCase = false;
                }
            }
            if (currentLet[0] == 10)
            {
                if (result[resultCounter - 1] == '*')
                    result[resultCounter++] = ' ';
                for (int j = 0; j < currentLet[1]; j++)
                    result[resultCounter++] = '*';
            }
            else
            {
                if (result[resultCounter - 1] - '0' == currentLet[0])
                    result[resultCounter++] = ' ';
                for (int j = 0; j < currentLet[1]; j++)
                    result[resultCounter++] = currentLet[0] + '0';
            }
        }
    }
    result[resultCounter] = '\0';
    return result;
}