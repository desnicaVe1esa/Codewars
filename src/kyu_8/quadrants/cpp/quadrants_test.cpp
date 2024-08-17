Describe(Fixed) {
  It(Example) {
    Assert::That(quadrant(1, 2), Equals(1));
    Assert::That(quadrant(3, 5), Equals(1));
    Assert::That(quadrant(-10, 100), Equals(2));
    Assert::That(quadrant(-1, -9), Equals(3));
    Assert::That(quadrant(19, -56), Equals(4));
  }
};