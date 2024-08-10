function getLengthOfMissingArray(arrayOfArrays) {
    const lengths = (arrayOfArrays || [])
        .map(a => a ? a.length : 0)
        .sort((a, b) => a - b)

    if (lengths.includes(0)) {
        return 0
    }

    for (let i = 0; i < lengths.length - 1; i++) {
        if (lengths[i] + 1 !== lengths[i + 1]) {
            return lengths[i] + 1
        }
    }

    return 0
}
module.exports = getLengthOfMissingArray;