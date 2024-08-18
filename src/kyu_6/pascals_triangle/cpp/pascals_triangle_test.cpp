Describe(Tests)
{
    It(Depth_1)
    {
        Assert::That(pascalsTriangle(1), Equals(std::vector<long long>{1}));
    }
    It(Depth_2)
    {
        Assert::That(pascalsTriangle(2), Equals(std::vector<long long>{1, 1, 1}));
    }
    It(Depth_4)
    {
    	Assert::That(pascalsTriangle(4), Equals(std::vector<long long>{1,1,1,1,2,1,1,3,3,1}));
    }
};