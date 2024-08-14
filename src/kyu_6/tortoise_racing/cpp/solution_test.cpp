#include <vector>

void testequal(std::vector<int> ans, std::vector<int> sol)
{
    Assert::That(ans, Equals(sol));
}
void dotest(int v1, int v2, int g, std::vector<int> expected)
{
    testequal(Tortoise::race(v1, v2, g), expected);
}

Describe(race_Tests)
{
    It(Fixed__Tests)
    {
        dotest(720, 850, 70, {0, 32, 18});
        dotest(820, 81, 550, {-1, -1, -1});
        dotest(80, 91, 37, {3, 21, 49});
    }
};
