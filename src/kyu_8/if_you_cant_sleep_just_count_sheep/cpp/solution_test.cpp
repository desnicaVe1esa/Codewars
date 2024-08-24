
Describe(CountingSheep) {
  It(BasicTests) {
    Assert::That(countSheep(0), Equals(""));
    Assert::That(countSheep(1), Equals("1 sheep..."));
    Assert::That(countSheep(2), Equals("1 sheep...2 sheep..."));
    Assert::That(countSheep(3), Equals("1 sheep...2 sheep...3 sheep..."));
    Assert::That(countSheep(4), Equals("1 sheep...2 sheep...3 sheep...4 sheep..."));
    Assert::That(countSheep(5), Equals("1 sheep...2 sheep...3 sheep...4 sheep...5 sheep..."));
  }
};