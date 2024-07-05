long long get_sum(unsigned n)
{
    return ((4L * n + 10L) * n + 5L) * (1L - n % 2L * 2L) - 1L >> 2L;
}