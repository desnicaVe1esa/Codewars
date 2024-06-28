#include <string>
#include <vector>

class MaxDiffLength
{
public:
    static int mxdiflg(std::vector<std::string> &a1, std::vector<std::string> &a2)
    {
        int result = -1;
        for(auto const & a : a1)
        {
            for(auto const & b : a2)
            {
                result = std::max(result, std::abs(int(a.size()) - int(b.size())));
            }
        }
        return result;
    }
};