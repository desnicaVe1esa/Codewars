Describe(Sample_Tests)
{
    It(Tests)
    {
        Assert::That(parse_int("one"), Equals(1));
        Assert::That(parse_int("twenty"), Equals(20));
        Assert::That(parse_int("two hundred and forty-six"), Equals(246));
    }
};