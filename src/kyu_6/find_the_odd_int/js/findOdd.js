function findOdd(A) {
    let xor = 0;
    for (let i = 0; i < A.length; i++) {
        xor ^= A[i];
    }
    return xor;
}

module.exports = findOdd;