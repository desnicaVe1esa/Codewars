#include <string>

std::string pofi(unsigned n) {
        if (n % 4 == 0) {
            return "1";
        }else if (n % 4 == 1) {
            return "i";
        }else if (n % 4 == 2) {
            return "-1";
        } else {
            return "-i";
        }
}