#include <string>

std::string broken(const std::string& inp)
{
    std::string result;
    for (std::size_t i = 0; i < inp.length(); ++i)
    {
        result += inp[i] == '0' ? "1" : "0";
    }
    return result;
}