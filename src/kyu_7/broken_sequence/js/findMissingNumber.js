function findMissingNumber(sequence) {
    if (!sequence) return 0;
    sequence = sequence.split(" ");

    for (let i = 0; i < sequence.length; i++) {
        if (sequence[i] !== i + 1) return i + 1;
    }

    return 0;
}

module.exports = findMissingNumber;