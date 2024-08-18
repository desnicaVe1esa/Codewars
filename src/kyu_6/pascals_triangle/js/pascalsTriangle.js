function pascalsTriangle(n) {
    if (n === 1) {
        return [1];
    }
    var prev = pascalsTriangle(n - 1), len = prev.length;
    prev.push(1);
    for (var i = len - n + 1; i < len - 1; i ++) {
        prev.push(prev[i] + prev[i + 1]);
    }
    prev.push(1);
    return prev;
}
module.exports = pascalsTriangle;