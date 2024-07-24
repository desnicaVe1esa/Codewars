#include <vector>
using namespace std;

int nthSmallest (vector<int> passed, int n)
{
   sort(passed.begin(), passed.end());
   return passed[--n];
}