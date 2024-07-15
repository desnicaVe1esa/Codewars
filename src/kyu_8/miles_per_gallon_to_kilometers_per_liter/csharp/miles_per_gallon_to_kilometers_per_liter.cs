#include <cmath>

double converter(int mpg)
{
    double kpl = mpg * 1.609344 / 4.54609188;
    return round(kpl * 100) / 100;
}