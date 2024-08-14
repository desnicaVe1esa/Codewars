#include <vector>
#include <string>
#include <cctype>

std::vector<int> solve(std::vector<std::string> v) {
  std::vector<int> result (v.size());
  for (int i = 0; i < v.size(); i++)
    for (int j = 0; j < v[i].length(); j++)
      if (toupper(v[i][j]) - 65 == j)
        result[i]++;
  return result;
}