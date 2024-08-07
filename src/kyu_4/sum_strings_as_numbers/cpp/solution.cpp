#include <string>

std::string sum_strings(std::string a, std::string b) {

  bool overTen = false;

  while (a.length() < b.length()) a = "0" + a;
  while (b.length() < a.length()) b = "0" + b;

  for (int i = a.length()-1; i >=0; i--) {
    a[i] += b[i] - 48 + overTen;
    if (a[i] > '9') {overTen = true; a[i] -= 10;} else overTen = false;
  }

  return (overTen) ? "1" + a: a;
}