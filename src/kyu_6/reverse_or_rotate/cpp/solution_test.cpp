#include <string>

void testequal(std::string ans, std::string sol)
{
    Assert::That(ans, Equals(sol));
}
static void dotest(std::string s, unsigned int sz, std::string expected)
{
    testequal(RevRot::revRot(s, sz), expected);
}

Describe(revRot_Tests)
{
    It(Fixed__Tests)
    {
        std::string s = "1234";
        dotest(s, 0, "");
        s = "";
        dotest(s, 0, "");
        s = "733049910872815764";
        dotest(s, 5, "330479108928157");
        s = "73304991087281576455176044327690580265896";
        dotest(s, 8, "1994033775182780067155464327690480265895");
    }
};
