#include <vector>

using iv = std::vector<int>;
using ivv = std::vector<iv>;

Describe(Tests) {
  It(BasicTests) {
    Assert::That(pyramid(0), Equals(ivv{}));
    Assert::That(pyramid(1), Equals(ivv{iv{1}}));
    Assert::That(pyramid(2), Equals(ivv{iv{1}, iv{1, 1}}));
    Assert::That(pyramid(3), Equals(ivv{iv{1}, iv{1, 1}, iv{1, 1, 1}}));
  }
};