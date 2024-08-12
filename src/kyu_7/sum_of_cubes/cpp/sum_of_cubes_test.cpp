Describe(Test_Cases) {
  It(Fixed_Tests) {
    Assert::That(sum_cubes(1), Equals(1));
    Assert::That(sum_cubes(2), Equals(9));
    Assert::That(sum_cubes(3), Equals(36));
    Assert::That(sum_cubes(4), Equals(100));
    Assert::That(sum_cubes(10), Equals(3025));
    Assert::That(sum_cubes(123), Equals(58155876));
  }
};