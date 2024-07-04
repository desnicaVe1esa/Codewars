#include <utility>

Describe(Sample_cases) {
  It(Small_numbers) {
    Assert::That(swap_values(std::pair<int, int>{1, 2}), Equals(std::pair<int, int>{2, 1}));
  }
  It(Bigger_numbers) {
    Assert::That(swap_values(std::pair<int, int>{14958573, 222032399}), Equals(std::pair<int, int>{222032399, 14958573}));
  }
};
