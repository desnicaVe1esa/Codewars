Describe(Minimum_Sum_)
{
    It(return_minmum_Sum_Of_Numbers)
    {
        Assert::That(minSum({5,4,2,3}), Equals(22));
          Assert::That(minSum({12,6,10,26,3,24}), Equals(342));
            Assert::That(minSum({9,2,8,7,5,4,0,6}), Equals(74));

    }
};