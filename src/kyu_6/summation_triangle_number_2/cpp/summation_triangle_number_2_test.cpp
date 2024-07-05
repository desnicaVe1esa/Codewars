#include <string>

Describe(Sample_Tests)
{
    It(Example_Tests)
    {
        unsigned int n = 0;
        Assert::That(get_sum(n), Equals(1), ExtraMessage("Incorrect answer for n="+std::to_string(n)));
        n = 1;
        Assert::That(get_sum(n), Equals(-5), ExtraMessage("Incorrect answer for n="+std::to_string(n)));
        n = 2;
        Assert::That(get_sum(n), Equals(10), ExtraMessage("Incorrect answer for n="+std::to_string(n)));
        n = 3;
        Assert::That(get_sum(n), Equals(-18), ExtraMessage("Incorrect answer for n="+std::to_string(n)));
        n = 100;
        Assert::That(get_sum(n), Equals(10251), ExtraMessage("Incorrect answer for n="+std::to_string(n)));
        n = 1000;
        Assert::That(get_sum(n), Equals(1002501), ExtraMessage("Incorrect answer for n="+std::to_string(n)));
    }
};