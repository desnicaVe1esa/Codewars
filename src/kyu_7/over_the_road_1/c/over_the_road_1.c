#include <stddef.h>

size_t over_the_road(size_t address, size_t street) {
    return street * 2 - address + 1;
}