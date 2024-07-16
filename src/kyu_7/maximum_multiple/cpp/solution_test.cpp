Describe(Maximum_Multiple)
{
    It(Check_Small_Positives)
    {
        Assert::That(maxMultiple(2,7), Equals(6));
          Assert::That(maxMultiple(3,10), Equals(9));
            Assert::That(maxMultiple(7,17), Equals(14));
    }
    It(Larger_Positives)
    {
        Assert::That(maxMultiple(10,50), Equals(50));
          Assert::That(maxMultiple(37,200), Equals(185));
            Assert::That(maxMultiple(7,100), Equals(98));
    }
};