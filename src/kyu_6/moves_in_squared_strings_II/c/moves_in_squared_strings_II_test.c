#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <criterion/criterion.h>

char *rot(char* strng);
char* selfieAndRot(char* strng);
typedef char* (*generic_func_t) (char*);
char* oper(generic_func_t f, char* s);

void dotest1(char* s, char *expr) {
    char *act = rot(s);
    if(strcmp(act, expr) != 0)
        printf("rot. Error. Expected \n%s\n but got \n%s\n", expr, act);
    cr_assert_str_eq(act, expr, "");
    free(act); act = NULL;
}
void dotest2(char* s, char *expr) {
    char *act = selfieAndRot(s);
    if(strcmp(act, expr) != 0)
        printf("selfieAndRot. Error. Expected \n%s but got \n%s\n", expr, act);
    cr_assert_str_eq(act, expr, "");
    free(act); act = NULL;
}
Test(kata, ShouldPassAllTheTestsProvided) {
    printf("Testing rot\n");
    {
        char s[] = "fijuoo\nCqYVct\nDrPmMJ\nerfpBA\nkWjFUG\nCVUfyL";
        char sol[] = "LyfUVC\nGUFjWk\nABpfre\nJMmPrD\ntcVYqC\nooujif";
        dotest1(s, sol);
    }
    {
        char s[] = "rkKv\ncofM\nzXkh\nflCB";
        char sol[] = "BClf\nhkXz\nMfoc\nvKkr";
        dotest1(s, sol);
    }
    printf("Testing selfieAndRot\n");
    {
        char s[] = "xZBV\njsbS\nJcpN\nfVnP";
        char sol[] = "xZBV....\njsbS....\nJcpN....\nfVnP....\n....PnVf\n....NpcJ\n....Sbsj\n....VBZx";
        dotest2(s, sol);
    }
    {
        char s[] = "xZBV\njsbS\nJcpN\nfVnP";
        char sol[] = "xZBV....\njsbS....\nJcpN....\nfVnP....\n....PnVf\n....NpcJ\n....Sbsj\n....VBZx";
        dotest2(s, sol);
    }
}