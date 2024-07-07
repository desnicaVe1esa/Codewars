class Kata
{
  public:
  static bool validate(long long int n)
  {
    int sum = 0;
    bool doubleDigit = false;

    while (n > 0)
    {
      int digit = n % 10;

      if (doubleDigit)
      {
        digit *= 2;

        if (digit > 9)
        {
          digit -= 9;
        }

      sum += digit;
      doubleDigit = !doubleDigit;
      n /= 10;
    }

    return sum % 10 == 0;
  }
};