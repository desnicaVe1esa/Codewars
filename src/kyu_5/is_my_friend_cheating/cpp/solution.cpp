#include <vector>

class RemovedNumbers
{
public:
	static std::vector<std::vector<long long>> removNb(long long n)
  {
    std::vector<std::vector<long long>> retVec;
    long long sum = (n*n+n)/2;
    for(long long i=n/2; i<=n; i++)
      if((sum-i)%(1+i)==0){
        retVec.push_back(*new std::vector<long long>{i, (sum-i)/(1+i)});
      }
    return retVec;
  }
};