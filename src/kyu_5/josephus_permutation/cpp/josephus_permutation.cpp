#include <vector>

std::vector <int> josephus(std::vector <int> items, int k) {
    std::vector< int > result;
    int pos = k-1;

    while (items.size())
    {
        pos %= items.size();
        result.push_back(items[pos]);
        items.erase(items.begin()+pos);
        pos += k-1;
    }

    return result;
}