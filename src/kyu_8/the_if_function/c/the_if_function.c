#include <stdbool.h>

void _if(bool value, void (*func1)(), void (*func2)())
{
    value ? func1() : func2();
}