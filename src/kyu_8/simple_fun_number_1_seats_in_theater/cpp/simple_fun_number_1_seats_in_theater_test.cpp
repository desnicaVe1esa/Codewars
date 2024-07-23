Describe(Sample_Tests)
{
    It(Tests)
    {
        Assert::That(seats_in_theater(16,11,5,3), Equals(96));
        Assert::That(seats_in_theater(1,1,1,1), Equals(0));
        Assert::That(seats_in_theater(13,6,8,3), Equals(18));
        Assert::That(seats_in_theater(60,100,60,1), Equals(99));
        Assert::That(seats_in_theater(1000,1000,1000,1000), Equals(0));
    }
};