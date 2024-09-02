Describe(Simple_Tests)
{
    It(Test_simple_case)
    { 
        Assert::That(josephus({1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1), Equals(std::vector < int > ({1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
        Assert::That(josephus({1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2), Equals(std::vector < int > ({2, 4, 6, 8, 10, 3, 7, 1, 9, 5})));
        Assert::That(josephus({1, 2, 3, 4, 5, 6, 7}, 3), Equals(std::vector < int > ({3, 6, 2, 7, 5, 1, 4})));
        Assert::That(josephus({}, 3), Equals(std::vector < int > ({}))); 
   }
};
