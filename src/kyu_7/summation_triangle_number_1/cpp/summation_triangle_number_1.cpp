unsigned long long get_sum(unsigned int n)
{
        long result = 0;
        for (long i = 1; i <= n + 1; i++)
        {
            result += i * (2 * i - 1);
        }
        return result;
}