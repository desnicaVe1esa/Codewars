#include <string>
#include<bits/stdc++.h>
#define ll long long
#define dll double
#define mxn 100002
using namespace std;
string s;
dll q[mxn];
ll st,qt,len;
inline dll dfs()
{
  ll l = qt + 1, zf = 1;
  dll x = 0, z = 0;
  char fh = ' ';
  while(st < len - 1)
  {
    if((s[st] >= '0' && s[st] <= '9') || s[st] == '(')
    {
      x = 0;
      if(s[st] == '(') st++, x=dfs();
      else while(s[st] >= '0' && s[st] <= '9')
        x = x * 10 + s[st] - '0', st++;
      x *= zf;
      zf = 1;
      if(fh == ' ') q[++qt] = x;
      else if(fh == '*') q[qt]*=x;
      else q[qt] /= x;
      fh = ' ';
    }else if(s[st] == '-') zf *= -1, st++;
    else if(s[st] == '*') fh = '*', st++;
    else if(s[st] == '/') fh = '/', st++;
    else if(s[st] == ')')
    {
      st++;
      break;
    }
    else st++;
  }
  while(qt >= l) z += q[qt--];
  return z;
}
dll calc(std::string expression) {
  s = expression + '.'; qt = st = 0; len = s.length();
  return dfs();
}