#include <utility>
#include <vector>

unsigned int number(const std::vector<std::pair<int, int>>& busStops){
  unsigned int result = 0;
  for(std::pair<int, int> i : busStops)
  {
    result += i.first - i.second;
  }
  return result;
}