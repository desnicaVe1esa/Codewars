#include <string>

void testequal(std::string ans, std::string sol)
{
    Assert::That(ans, Equals(sol));
}
template<typename Func>
static void dotest(Func func, std::string s, std::string expected)
{
    testequal(Opstrings1::oper(func, s), expected);
}

Describe(oper_Tests)
{
    It(rot_Tests)
    {
        std::string s = "fijuoo\nCqYVct\nDrPmMJ\nerfpBA\nkWjFUG\nCVUfyL";
        std::string sol = "LyfUVC\nGUFjWk\nABpfre\nJMmPrD\ntcVYqC\nooujif";
        dotest(Opstrings1::rot, s, sol);
        s = "rkKv\ncofM\nzXkh\nflCB";
        sol = "BClf\nhkXz\nMfoc\nvKkr";
        dotest(Opstrings1::rot, s, sol);
    }
    It(selfieAndRot_Tests)
    {
        std::string s = "xZBV\njsbS\nJcpN\nfVnP";
        std::string sol = "xZBV....\njsbS....\nJcpN....\nfVnP....\n....PnVf\n....NpcJ\n....Sbsj\n....VBZx";
        dotest(Opstrings1::selfieAndRot, s, sol);
        s = "xZBV\njsbS\nJcpN\nfVnP";
        sol = "xZBV....\njsbS....\nJcpN....\nfVnP....\n....PnVf\n....NpcJ\n....Sbsj\n....VBZx";
        dotest(Opstrings1::selfieAndRot, s, sol);
    }
};

