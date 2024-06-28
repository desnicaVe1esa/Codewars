#include <string>
#include <vector>

void testequal(int ans, int sol) {
    Assert::That(ans, Equals(sol));
}
void dotest(std::vector<std::string> &a1, std::vector<std::string> &a2, int expected)
{
    testequal(MaxDiffLength::mxdiflg(a1, a2), expected);
}
Describe(mxdiflg_Tests)
{
    It(Fixed__Tests)
    {
        std::vector<std::string> s1 = {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        std::vector<std::string> s2 = {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        dotest(s1, s2, 13);
        s1 = {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"};
        s2 = {"bbbaaayddqbbrrrv"};
        dotest(s1, s2, 10);
    }
};

