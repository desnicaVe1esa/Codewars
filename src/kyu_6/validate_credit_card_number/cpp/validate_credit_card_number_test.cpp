Describe(validate_function)
{
    It(basic_tests)
    {
        Assert::That(Kata::validate(891), Equals(false));
        Assert::That(Kata::validate(2121), Equals(true));
    }
};