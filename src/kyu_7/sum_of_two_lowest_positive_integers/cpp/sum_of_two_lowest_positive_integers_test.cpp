Describe(Tests)
{
    It(BasicTest)
    {
        long expected = 13;

        long actual = sumTwoSmallestNumbers({ 5, 8, 12, 19, 22 });

        Assert::That(actual, Is().EqualTo(expected));
    }
};