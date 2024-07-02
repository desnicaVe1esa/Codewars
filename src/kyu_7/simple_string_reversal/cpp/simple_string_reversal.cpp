using namespace std;

string solve(string s) {
  string reversed;
  for (int i = s.length() - 1; i >= 0; i--)
  {
    if (s[i] != ' ')
    {
      reversed += s[i];
    }
    if (s[reversed.length()] == ' ')
    {
      reversed += ' ';
    }
  }
  return reversed;
}