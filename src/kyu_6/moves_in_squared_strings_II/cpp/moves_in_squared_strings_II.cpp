#include<bits/stdc++.h>
using namespace std;
class Opstrings1
{
public:
    static std::string rot(const std::string &strng);
    static std::string selfieAndRot(const std::string &strng);
    // ... complete oper
    static std::string oper(function <string(string)>fun, const std::string &s){
      return fun(s);
    }
};

string Opstrings1::rot(const std::string &strng){
  string strr(strng);
  reverse(strr.begin(),strr.end());
  return strr;
}
string Opstrings1::selfieAndRot(const std::string &strng){
  stringstream ss(strng);
  string tmp,str,revstr;
  while(getline(ss,tmp))
    str+=tmp+string(tmp.length(),'.')+"\n";
  revstr=str;
  revstr.pop_back();
  reverse(revstr.begin(),revstr.end());
  str+=revstr;
  return str;
}