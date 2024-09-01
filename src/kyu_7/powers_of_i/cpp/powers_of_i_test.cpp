Describe(basic_tests)
{
    It(powers_0_through_10)
    {
        Assert::That(pofi(0), Equals("1"));
        Assert::That(pofi(1), Equals("i"));
        Assert::That(pofi(2), Equals("-1"));
        Assert::That(pofi(3), Equals("-i"));
        Assert::That(pofi(4), Equals("1"));
        Assert::That(pofi(5), Equals("i"));
        Assert::That(pofi(6), Equals("-1"));
        Assert::That(pofi(7), Equals("-i"));
        Assert::That(pofi(8), Equals("1"));
        Assert::That(pofi(9), Equals("i"));
        Assert::That(pofi(10), Equals("-1"));
    }
};