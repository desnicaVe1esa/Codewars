Describe(Jumping_Number)
{
    It(Single_Digit_Number)
    {
        Assert::That(jumpingNumber(9), Equals("Jumping!!"));
          Assert::That(jumpingNumber(1), Equals("Jumping!!"));
            Assert::That(jumpingNumber(7), Equals("Jumping!!"));
    }
    It(Two_Digit_Number)
    {
        Assert::That(jumpingNumber(23), Equals("Jumping!!"));
          Assert::That(jumpingNumber(32), Equals("Jumping!!"));
            Assert::That(jumpingNumber(79), Equals("Not!!"));
              Assert::That(jumpingNumber(98), Equals("Jumping!!"));
    }
    It(Larger_Numbers)
    {
        Assert::That(jumpingNumber(8987), Equals("Jumping!!"));
          Assert::That(jumpingNumber(4343456), Equals("Jumping!!"));
            Assert::That(jumpingNumber(98789876), Equals("Jumping!!"));
    }
};