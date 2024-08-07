Describe(Sample_Tests)
{
    It(Tests)
    {
        Assert::That(calc("1 + 1"), Equals(2));
        Assert::That(calc("8/16"), Equals(0.5));
        Assert::That(calc("3 -(-1)"), Equals(4));
        Assert::That(calc("2 + -2"), Equals(0));
        Assert::That(calc("10- 2- -5"), Equals(13));
        Assert::That(calc("(((10)))"), Equals(10));
        Assert::That(calc("3 * 5"), Equals(15));
        Assert::That(calc("-7 * -(6 / 3)"), Equals(14));
    }
};