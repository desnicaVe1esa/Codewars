#include <algorithm>

template<class T>
bool compareBySize(std::vector<T> const &a, std::vector<T> const &b)
{
    return a.size() < b.size();
}

template<class T>
int getLengthOfMissingArray(std::vector<std::vector<T>> arrayOfArrays)
{
    std::sort(arrayOfArrays.begin(), arrayOfArrays.end(), compareBySize<T>);

    int missing = arrayOfArrays[0].size();
    for (auto it = arrayOfArrays.begin(); it != arrayOfArrays.end(); it++, missing++)
        if ((*it).size() != missing || missing == 0)
            return missing;

    return 0;
}