var countBits = function(n) {
    const res = (n).toString(2).split('');
    return res.reduce((sum, num) => sum + Number(num), 0);
};

module.exports = countBits;