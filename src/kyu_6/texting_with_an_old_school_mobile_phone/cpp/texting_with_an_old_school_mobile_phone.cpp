#include <string>
#include <map>

using namespace std;

string send_message(const string& message)
{
  map<char, string> change {
    {'1', "1-"}, {'.', "1"},  {',', "11"},  {'?', "111"}, {'!', "1111"},
    {'2', "2-"}, {'a', "2"}, {'b', "22"}, {'c', "222"},
    {'3', "3-"}, {'d', "3"}, {'e', "33"}, {'f', "333"},
    {'4', "4-"}, {'g', "4"}, {'h', "44"}, {'i', "444"},
    {'5', "5-"}, {'j', "5"}, {'k', "55"}, {'l', "555"},
    {'6', "6-"}, {'m', "6"}, {'n', "66"}, {'o', "666"},
    {'7', "7-"}, {'p', "7"}, {'q', "77"}, {'r', "777"}, {'s', "7777"},
    {'8', "8-"}, {'t', "8"}, {'u', "88"}, {'v', "888"},
    {'9', "9-"}, {'w', "9"}, {'x', "99"}, {'y', "999"}, {'z', "9999"},
    {'*', "*-"}, {'\'', "*"}, {'-', "**"}, {'+', "***"}, {'=', "****"},
    {'0', "0-"}, {' ', "0"},
    {'#', "#-"}
  };
  string result;
  bool isLower = true;
  for (auto c : message) {
    if (isalpha(c) && (bool(islower(c)) != isLower)) {
      result.push_back('#');
      isLower ^= true;
    }
    auto add = change[tolower(c)];
    if (result.size() > 0 && result.back() == add[0]) result.push_back(' ');
    result.append(add);
  }
  return result;
}