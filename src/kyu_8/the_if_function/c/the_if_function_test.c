#include <criterion/criterion.h>
#include <stdbool.h>
#include <string.h>

extern void _if(bool value, void (*func1)(), void (*func2)());

#define BOOLEXP(b)  ((b) ? "true" : "false")

typedef struct {
    void (*func)();
    char *name;
} functype;

static char actual[32];
static unsigned ncall;

void cli_start() { strcpy(actual, "cli_start"); ++ncall; }
void cli_stop() { strcpy(actual, "cli_stop"); ++ncall; }

void assert_data(bool value, functype func1, functype func2, const char *expected)
{
    *actual = ncall = 0;
    _if(value, func1.func, func2.func);
    if (*actual != 0 && !strcmp(actual, expected) && ncall == 1)
        cr_assert(1);
    else {
        if (!*actual)
            cr_assert_fail("Error: none of functions were run!\n");
        else if (ncall != 1)
            cr_assert_fail("Error: should call the function only once!\n");
        else
            cr_assert_fail("*Actual*: %s()\nExpected: %s()\n  Value: %s\n  Func1: %s()\n  Func2: %s()\n",
                actual, expected, BOOLEXP(value), func1.name, func2.name);
    }
}

Test(Sample_Test, should_call_the_function)
{
    assert_data(true,  (functype){ cli_start, "cli_start" }, (functype){ cli_stop, "cli_stop" }, "cli_start");
    assert_data(false, (functype){ cli_start, "cli_start" }, (functype){ cli_stop, "cli_stop" }, "cli_stop");
}