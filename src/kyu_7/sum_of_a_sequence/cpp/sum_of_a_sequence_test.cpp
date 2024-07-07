Describe(Tests)
{
    It(ExampleTests)
    {
        Assert::That(sequenceSum(2, 6, 2), Is().EqualTo(12));
        Assert::That(sequenceSum(1, 5, 1), Is().EqualTo(15));
        Assert::That(sequenceSum(1, 5, 3), Is().EqualTo(5));
        Assert::That(sequenceSum(0, 15, 3), Is().EqualTo(45));
        Assert::That(sequenceSum(16, 15, 3), Is().EqualTo(0));
        Assert::That(sequenceSum(2, 24, 22), Is().EqualTo(26));
        Assert::That(sequenceSum(2, 2, 2), Is().EqualTo(2));
        Assert::That(sequenceSum(2, 2, 1), Is().EqualTo(2));
        Assert::That(sequenceSum(1, 15, 3), Is().EqualTo(35));
        Assert::That(sequenceSum(15, 1, 3), Is().EqualTo(0));
    }
};;