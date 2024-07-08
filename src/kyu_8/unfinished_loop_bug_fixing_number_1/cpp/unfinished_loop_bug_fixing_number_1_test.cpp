Describe(exampleTests)
{
    It(BasicTests1)
    {
        std::vector<int> res = {1};
        Assert::That(createVector(1), Equals(res));
    }

    It(BasicTests2)
    {
        std::vector<int> res = {1, 2};
        Assert::That(createVector(2), Equals(res));
    }

    It(BasicTests3)
    {
        std::vector<int> res = {1, 2, 3};
        Assert::That(createVector(3), Equals(res));
    }

    It(BasicTests4)
    {
        std::vector<int> res = {1, 2, 3, 4};
        Assert::That(createVector(4), Equals(res));
    }

    It(BasicTests5)
    {
        std::vector<int> res = {1, 2, 3, 4, 5};
        Assert::That(createVector(5), Equals(res));
    }
};