#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <criterion/criterion.h>

typedef struct Pair Pair;
struct Pair {
    long long first;
    long long snd;
};

Pair** removNb(long long n, int* length);
// fct  to compare results; sz number of pairs / Pair** arr will be freed
char* array2StringData(Pair** arr, int sz);

void dotest(long long n, char* sexpr) {
    int lg = 0;
    Pair** act = removNb(n, &lg);
    char* sact = array2StringData(act, lg);
    if(strcmp(sact, sexpr) != 0)
        printf("Error. Expected %s but got %s\n", sexpr, sact);
    cr_assert_str_eq(sact, sexpr, "");
    if (strcmp(sact, "{}") != 0) {
        free(sact); sact = NULL;
    }
}

Test(removNb, ShouldPassAllTheTestsProvided) {
    dotest(26, "{{15, 21}{21, 15}}");
    dotest(100 , "{}");
    dotest(37 , "{{21, 31}{31, 21}}");
    dotest(101 , "{{55, 91}{91, 55}}");
}