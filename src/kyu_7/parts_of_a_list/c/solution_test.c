#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <criterion/criterion.h>

typedef struct Pair Pair;
struct Pair {
    char* first;
    char* snd;
};

Pair** partlist(char** arr, int sz);

// your results and test results are compared by way of strings
//
//////// arr will be totally freed ////////
char* array2StringData(Pair** arr, int sz);
///////////////////////////////////////////
//

void dotest(char** arr, int sz, char *expr) {
    Pair** act = partlist(arr, sz);
    char* sact = array2StringData(act, sz - 1);
    if(strcmp(sact, expr) != 0)
        printf("partList. Error. Expected \n%s\n but got \n%s\n", expr, sact);
    cr_assert_str_eq(sact, expr, "");
    free(sact); sact = NULL;
}

Test(partList, ShouldPassAllTheTestsProvided) {
    {
        char* s[4] = {"cdIw", "tzIy", "xDu", "rThG"};
        char* sol = "{{cdIw, tzIy xDu rThG}{cdIw tzIy, xDu rThG}{cdIw tzIy xDu, rThG}}";
        dotest(s, 4, sol);
    }
    {
        char* s[5] = {"I", "wish", "I", "hadn't", "come"};
        char* sol = "{{I, wish I hadn't come}{I wish, I hadn't come}{I wish I, hadn't come}{I wish I hadn't, come}}";
        dotest(s, 5, sol);
    }
    {
        char* s[4] = {"vJQ", "anj", "mQDq", "sOZ"};
        char* sol = "{{vJQ, anj mQDq sOZ}{vJQ anj, mQDq sOZ}{vJQ anj mQDq, sOZ}}";
        dotest(s, 4, sol);
    }
}