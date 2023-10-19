const reverseSeq = n => {
    let result = [];
    let decrement = n;
    for (let i = 0; i < n; i++) {
        result.push(decrement);
        decrement--;
    }
    return result;
};

module.exports = reverseSeq;