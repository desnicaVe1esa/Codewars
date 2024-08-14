class Tortoise
{
public:
    static std::vector<int> race(int v1, int v2, int g)
    {
        if (v1 > v2)
        {
            return {-1,-1,-1};
        }
        int closingTime =  (g * 3600) / (v2 - v1);
        return std::vector<int>{closingTime / 3600, (closingTime % 3600) / 60, closingTime % 60};
    };
};