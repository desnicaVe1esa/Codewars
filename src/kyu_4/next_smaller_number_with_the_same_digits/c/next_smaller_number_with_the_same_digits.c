long long next_smaller_number(unsigned long long n)
{
    unsigned long long work = n;
    int seen[10] = {0}, good = 0, i = 9, j;
    while (work && !good)
        j = i, ++seen[(i = work % 10)], work /= 10, good = j < i;
    if (!good) return -1;
    for (j = 9; j >= 0; --j)
        if (j < i && seen[j])
            work *= 10, work += j, --seen[j], j = -1;
    if (!work) return -1; // attempted to place leading zero
    for (j = 9; j >= 0; --j)
        while (seen[j])
            work *= 10, work += j, --seen[j];
    return work;
}