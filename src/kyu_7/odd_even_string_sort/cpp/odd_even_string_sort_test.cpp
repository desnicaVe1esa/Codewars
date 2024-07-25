Describe(Other_Tests)
{
    It(Static_Ones)
    {
        Assert::That(sortMyString("CodeWars"), Equals("CdWr oeas"));
        Assert::That(sortMyString("YCOLUE'VREER"), Equals("YOU'RE CLEVER"));
    }
};