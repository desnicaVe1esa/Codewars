Describe(HasUniqueChars)
{
    It(BasicTests)
    {
        Assert::That(hasUniqueChars("  nAa"), Equals(false));
        Assert::That(hasUniqueChars("abcdef"), Equals(true));
        Assert::That(hasUniqueChars("++-"), Equals(false));
        Assert::That(hasUniqueChars(" nAa "), Equals(false));
        Assert::That(hasUniqueChars(""), Equals(true));
    }
};