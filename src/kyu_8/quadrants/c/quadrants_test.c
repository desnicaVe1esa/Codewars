#include <criterion/criterion.h>

enum quadrants {I=1, II, III, IV};

enum quadrants quadrant(int x, int y);
void tester(int x, int y, enum quadrants expected);

Test(quadrant, Sample_Tests)
{
    tester(   1,   2,   I );
    tester(   3,   5,   I );
    tester( -10, 100,  II );
    tester(  -1,  -9, III );
    tester(  19, -56,  IV );
}

void tester(int x, int y, enum quadrants expected) {
    enum quadrants submitted = quadrant(x, y);
    const char *q[5] = {"*", "I", "II", "III", "IV"};
    cr_assert_eq(                                      submitted,    expected,
        "< Incorrect Quadrant >\n \nx = %d\ny = %d\n \nSubmitted %s\nExpected  %s\n \n",
                                    x,      y,       q[submitted], q[expected]
    );
}