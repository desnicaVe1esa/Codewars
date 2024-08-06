#include <numeric>

using namespace std;

class PartList
{
public:
    static std::vector<std::pair <std::string, std::string>> partlist(std::vector<std::string> &arr)
    {
      vector<pair<string, string>> result;
      auto combine = [](string a, string b) { return a + ' ' + b; };
      for (int i = 1; i < arr.size(); i++)
      {
        result.emplace_back(
          accumulate(arr.begin() + 1, arr.begin() + i, arr[0], combine),
          accumulate(arr.begin() + i + 1,  arr.end(), arr[i], combine));
      }
      return result;
    }
};