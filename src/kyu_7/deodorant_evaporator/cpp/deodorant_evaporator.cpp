#include <cmath>

using namespace std;
class Evaporator
{

  public:
  static int evaporator(double, double evap_per_day, double threshold);
};

int Evaporator::evaporator(double, double evap_per_day, double threshold) {
  const double evapFactor {(100.0 - evap_per_day) / 100.0};
  const double normalizedThreshold {threshold / 100.0};
  const double daysToThreshold {std::log (normalizedThreshold) / std::log(evapFactor)};
  
  return static_cast <int> (std::ceil(daysToThreshold));
}