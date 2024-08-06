#include <string>

using namespace std;

string jumpingNumber (int number)
{
  return number < 10 ? "Jumping!!" : abs(number % 10 - (number / 10) % 10) != 1 ? "Not!!" : jumpingNumber(number / 10);
}