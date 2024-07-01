#include <vector>

class Decomp
{
  public:
  static std::vector<long long> decompose(long long n);
  private:
  static bool Divide(std::vector<long long> &numbers, double remain, long long last);
};

std::vector<long long> Decomp::decompose(long long n)
{
  auto list = std::vector<long long>();
  if (Divide(list, n * n, n))
      return list;
  return std::vector<long long>() = {};
}

bool Decomp::Divide(std::vector<long long> &numbers, double remain, long long last)
{
    if (remain <= 0)
        return remain == 0;
    for (long long i = last - 1; i > 0; i--)
    {
        if (Divide(numbers, remain - (i * i), i))
        {
            numbers.push_back(i);
            return true;
        }
    }
    return false;
}