#include <set>
#include <vector>
#include <numeric>

int maxTriSum (const std::vector <int> &numbers)
{
  std::set<int> unique{numbers.begin(), numbers.end()};
  return std::accumulate(unique.rbegin(), std::next(unique.rbegin(), 3) , 0);
}