using namespace std;

string sortMyString(const string &s)
{
  string first, second;
  for (auto j = 0; j < s.size(); j ++) {
    if (j % 2) second.push_back(s[j]);
    else first.push_back(s[j]);
  }  
  return first + " " + second;
}