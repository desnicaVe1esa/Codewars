#include <algorithm>
#include <string>
#include <vector>

std::vector<std::string> dup(std::vector<std::string> arr) {
  for (auto& s : arr)
    s.erase(std::unique(s.begin(), s.end()), s.end());
  return arr;
}