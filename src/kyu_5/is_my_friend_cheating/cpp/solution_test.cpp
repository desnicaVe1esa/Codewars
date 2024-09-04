#include <vector>

using namespace std;

void testequal(vector<vector<long long>> ans, vector<vector<long long>> sol) {
    Assert::That(ans, Equals(sol));
}
Describe(removeNb_Tests)
{
    It(test1)
    {
        vector<vector<long long>> r1 = {{15, 21}, {21, 15}};
        testequal(RemovedNumbers::removNb(26), r1);
        vector<vector<long long>> r2 = {};
        testequal(RemovedNumbers::removNb(100), r2);
    }
};

