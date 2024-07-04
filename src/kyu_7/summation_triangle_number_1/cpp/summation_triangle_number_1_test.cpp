#include <string>

Describe(Sample_Tests)
{
    It(Example_Tests)
    {
        unsigned int n = 0;
        Assert::That(get_sum(n), Equals(1), ExtraMessage("Incorrect answer for n="+std::to_string(n)));
        n = 1;
        Assert::That(get_sum(n), Equals(7), ExtraMessage("Incorrect answer for n="+std::to_string(n)));
        n = 2;
        Assert::That(get_sum(n), Equals(22), ExtraMessage("Incorrect answer for n="+std::to_string(n)));
        n = 3;
        Assert::That(get_sum(n), Equals(50), ExtraMessage("Incorrect answer for n="+std::to_string(n)));
        n = 100;
        Assert::That(get_sum(n), Equals(691951), ExtraMessage("Incorrect answer for n="+std::to_string(n)));
        n = 1000;
        Assert::That(get_sum(n), Equals(669169501), ExtraMessage("Incorrect answer for n="+std::to_string(n)));
    }
};