Describe(Sample_Tests)
{
    It(Addition_Real)
    {
        Assert::That(add(2, 11), Equals(13), ExtraMessage("Incorrect answer for 2+11"));
        Assert::That(add(0, 1),  Equals(1), ExtraMessage("Incorrect answer for 0+1"));
        Assert::That(add(0, 0),  Equals(0), ExtraMessage("Incorrect answer for 0+0"));
    }

    It(Addition_Silly)
    {
        Assert::That(add(16, 18),  Equals(214),  ExtraMessage("Incorrect answer for 16+18"));
        Assert::That(add(122, 81), Equals(1103), ExtraMessage("Incorrect answer for 122+81"));
        Assert::That(add(26, 39),  Equals(515),  ExtraMessage("Incorrect answer for 26+39"));
    }
};
