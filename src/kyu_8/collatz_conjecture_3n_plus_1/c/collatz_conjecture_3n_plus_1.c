unsigned hotpo(unsigned n)
{
  return n < 2 ? 0 : 1 + hotpo(n % 2 ? 3 * n + 1 : n / 2);
}