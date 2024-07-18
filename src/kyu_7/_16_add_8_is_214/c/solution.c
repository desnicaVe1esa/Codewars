unsigned add(unsigned x, unsigned y)
{
    int res = 0, m = 1;
    while (x != 0 || y != 0)
    {
      int s = x % 10 + y % 10;
      res += s * m;
      m *= s < 10 ? 10 : 100;
      x /= 10;
      y /= 10;
    }
    return res;
}