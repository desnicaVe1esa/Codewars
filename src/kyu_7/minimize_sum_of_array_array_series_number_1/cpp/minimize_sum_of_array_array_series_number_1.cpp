#include <vector>
using namespace std;

int minSum (vector<int>passed)
{
  std::sort(passed.begin(), passed.end());
  int result = 0;
  for (int i = 0 ; i < passed.size() / 2; i++)
  {
    result += passed[i] * passed[passed.size() - i - 1];
  }
  return result;
}
