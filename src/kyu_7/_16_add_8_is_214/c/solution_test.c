#include <criterion/criterion.h>

void tester(unsigned x, unsigned y, unsigned z);

Test(Real_Addition, should_pass_all_the_tests_provided) {
    tester(    2,   11,   13);
    tester(    0,    1,    1);
    tester(    0,    0,    0);
}

Test(Silly_Addition, should_pass_all_the_tests_provided) {
    tester(   16,   18,  214);
    tester(   26,   39,  515);
    tester(  122,   81, 1103);
}
