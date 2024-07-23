Describe(test_two_sum)
{
    void do_test(const std::vector<int>& numbers, int target) {
        auto result = two_sum(numbers, target);
        Assert::That(result.first != result.second);
        Assert::That(numbers[result.first] + numbers[result.second], Equals(target));
    }
    It(should_pass_some_fixed_tests)
    {
        Assert::That(two_sum({1, 2, 3}, 4), Fulfills(EqualsUnordered{0, 2}));
        Assert::That(two_sum({1234, 5678, 9012}, 14690), Fulfills(EqualsUnordered{1, 2}));
        Assert::That(two_sum({2, 2, 3}, 4), Fulfills(EqualsUnordered{0, 1}));
    }
};
