Describe(sample_tests)
{
    It(test_digits)
    {
        Assert::That(digits(5ull), Equals(1));
        Assert::That(digits(12345ull), Equals(5));
        Assert::That(digits(9876543210ull), Equals(10));
    }
};
