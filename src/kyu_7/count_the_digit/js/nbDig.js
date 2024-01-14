function nbDig(n, d) {
    let k = 0;
    let result = 0;
    let iterator = 0;
    let count = 0;
    while (iterator <= n) {
        result = k * k;
        let arr = result.toString().split('');
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] === d.toString()) { count++; }
        }
        k++;
        iterator++;
    }
    return count;
}

module.exports = nbDig;