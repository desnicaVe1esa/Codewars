unsigned sequence_sum(unsigned start, unsigned end, unsigned step)
{
        int count = 0;
        for (int i = start; i <= end; i += step) {
            count += i;
        }
        return count;
}