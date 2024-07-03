#include <string>
#include <cctype>

std::string vaporcode(const std::string &str)
{
      std::string result;

      for(int i = 0; i < str.size(); i++)
      {
          if(str[i] == ' ') continue;
          result.push_back(std::toupper(str[i]));
          result.push_back(' ');
          result.push_back(' ');
      }
      while(result[result.size()-1] == ' ')
      {
        result.pop_back();
      }
      return result;
}