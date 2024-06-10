function sumMul(n,m){
    let result = 0;
    for (let i = 1; i * n < m; i++) {
        result += i * n
    }
    return result > 0 ? result : 'INVALID'
}
module.exports = sumMul;