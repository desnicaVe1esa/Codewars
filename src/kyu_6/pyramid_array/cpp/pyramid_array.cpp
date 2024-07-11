#include <vector>
#include <cstdlib>

std::vector<std::vector<int>> pyramid(std::size_t n) {
  std::vector<std::vector<int>> result;
  for (auto i = 1; i <= n; i ++)
  {
    result.push_back(std::vector<int>(i, 1));
  }
  return result;
}