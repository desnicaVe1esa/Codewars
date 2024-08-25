#include <algorithm>
#include <vector>

long sumTwoSmallestNumbers(std::vector<int> numbers)
{
    std::sort(numbers.begin(), numbers.end());

    return (long)numbers[0] + (long)numbers[1];
}