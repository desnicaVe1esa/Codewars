Describe(ExampleTests)
{
    It(BasicTest1)
    {
        int expected = 3;
        
        std::vector<std::vector<int>> testInput = { { 1, 2 }, { 4, 5, 1, 1 }, { 1 }, { 5, 6, 7, 8, 9 } };
        int actual = getLengthOfMissingArray(testInput);
    
        Assert::That(actual, Is().EqualTo(expected));
    }
    
    It(BasicTest2)
    {
        int expected = 2;
        
        std::vector<std::vector<int>> testInput = { { 5, 2, 9 }, { 4, 5, 1, 1 }, { 1 }, { 5, 6, 7, 8, 9 } };
        int actual = getLengthOfMissingArray(testInput);
    
        Assert::That(actual, Is().EqualTo(expected));
    }
    
    It(BasicTest3)
    {
        int expected = 5;
        
        std::vector<std::vector<char>> testInput = { { 'a', 'a', 'a' }, { 'a', 'a' }, { 'a', 'a', 'a', 'a' }, { 'a' }, { 'a', 'a', 'a', 'a', 'a', 'a' } };
        int actual = getLengthOfMissingArray(testInput);
    
        Assert::That(actual, Is().EqualTo(expected));
    }
};