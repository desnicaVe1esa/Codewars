#include <stdlib.h>

typedef struct Pair Pair;
struct Pair {
    long long first;
    long long second;
};

// Generates pairs of numbers that satisfy a certain condition
// Returns an array of pairs and updates length with the number of pairs generated
Pair** removNb(long long totalNumbers, int* length) {
    long long totalSum = (totalNumbers * (totalNumbers + 1) / 2);

    // Allocate memory for an array of pairs
    Pair** pairsArray = malloc(sizeof(Pair*) * totalNumbers);
    unsigned countPairs = 0; // Counter for pairs generated

    // Iterate through numbers to find pairs that satisfy the given condition
    for (long long i = 1; i < totalNumbers; i++) {
        long long secondNumber = (totalSum - i) / (i + 1);

        // Check condition for the pair and add it to the array if satisfied
        if (secondNumber < totalNumbers && i * secondNumber == totalSum - i - secondNumber) {
            // Create a pair
            Pair* pair = malloc(sizeof(Pair));
            pair->first = i;
            pair->second = secondNumber;

            pairsArray[countPairs++] = pair; // Add the pair to the array
        }
    }

    *length = countPairs; // Update the count of generated pairs
    return pairsArray; // Return the array of pairs
}