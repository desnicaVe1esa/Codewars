#include <string>

#include <string>

std::string switcheroo(const std::string &s)
{
    std::string result;
    for (int i = 0; i < s.length(); i++)
    {
        if(s[i] == 'a')
        {
          result += "b";
        } else if (s[i] == 'b')
        {
          result += "a";
        } else
        {
          result += s[i];
        }
    }
    return result;
}