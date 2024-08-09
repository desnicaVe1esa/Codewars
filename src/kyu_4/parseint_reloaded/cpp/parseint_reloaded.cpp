#include <string>
#include <map>

long parse_int(const std::string& number) {
  std::map<std::string, int> mapping = {
    {"zero", 0}, {"and", 0}, {"hundred", 100},  {"thousand", 1000}, {"million", 1000000},
    {"one", 1}, {"two",   2}, {"three",  3}, {"four", 4}, {"five", 5},
    {"six", 6}, {"seven", 7}, {"eight",  8}, {"nine", 9}, {"ten", 10},
    {"eleven",  11}, {"twelve",    12}, {"thirteen", 13}, {"fourteen", 14}, {"fifteen", 15},
    {"sixteen", 16}, {"seventeen", 17}, {"eighteen", 18}, {"nineteen", 19},
    {"twenty",  20}, {"thirty",  30},   {"forty",    40}, {"fifty",    50},
    {"sixty",   60}, {"seventy", 70},   {"eighty",   80}, {"ninety", 90}

  };

  long result = 0;
  auto add = [&] (auto& w) {
    if (w.empty()) return;
    auto i = mapping[w];
    if      (i > 0 && i < 100) result += i;
    else if (i == 1000 || i == 1000000) result *= i;
    else if (i == 100) result += 99 * (result % 100);
    w = "";
  };

  std::string word;
  for (auto c : number) {
    if (word.size() > 0 && (c == ' ' || c == '-')) add(word);
    else word.push_back(c);
  }
  add(word);

  return result;
}