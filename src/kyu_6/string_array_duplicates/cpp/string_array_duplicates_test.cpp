#include<vector>
using namespace std;

Describe(String_array_revisal)
{
    It(Example_tests)
    {
        Assert::That(dup(vector<string>{"ccooddddddewwwaaaaarrrrsssss","piccaninny","hubbubbubboo"}), Equals(vector<string>{"codewars","picaniny","hubububo"}));
        Assert::That(dup(vector<string>{"abracadabra","allottee","assessee"}), Equals(vector<string>{"abracadabra","alote","asese"}));
        Assert::That(dup(vector<string>{"kelless","keenness"}), Equals(vector<string>{"keles","kenes"}));
   
    }
}; 