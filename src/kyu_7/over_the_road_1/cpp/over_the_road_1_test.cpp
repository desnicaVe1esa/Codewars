Describe(Basic_Tests)
{
  It(Basic_Test_Cases) {
    Assert::That(over_the_road(1, 3), Equals(6));
    Assert::That(over_the_road(3, 3), Equals(4));
    Assert::That(over_the_road(2, 3), Equals(5));
    Assert::That(over_the_road(3, 5), Equals(8));
    Assert::That(over_the_road(7, 11), Equals(16));
    Assert::That(over_the_road(23633656673, 310027696726), Equals(596421736780));
  }
};