#include <string>
#include <algorithm>

class RevRot
{
public:
    static std::string revRot(const std::string &strng, unsigned int sz){
      if(sz <= 0 || strng.empty() || sz > strng.length())
        return "";
      std::string x = strng.substr(0,sz);
      bool p = true;
      for(const char& c : x)
        if(c % 2 == 1) // '0' == 48, so 'digit' is even iff digit is even
          p = !p;
      if(p){
        std::reverse(x.begin(),x.end());
        return x + revRot(strng.substr(sz),sz);
      }
      x += x[0];
      return x.substr(1) + revRot(strng.substr(sz),sz);
    }
};