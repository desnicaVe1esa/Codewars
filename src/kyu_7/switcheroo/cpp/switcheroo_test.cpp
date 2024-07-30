Describe(Fixed_tests) {
  It(Sample_cases) {
    Assert::That(switcheroo("abc"), Equals("bac"));
    Assert::That(switcheroo("aaabcccbaaa"), Equals("bbbacccabbb"));
    Assert::That(switcheroo("cccccc"), Equals("cccccc"));
    Assert::That(switcheroo("abababababababab"), Equals("babababababababa"));
    Assert::That(switcheroo("aaaa"), Equals("bbbb"));
    Assert::That(switcheroo("bbbb"), Equals("aaaa"));
  }
};