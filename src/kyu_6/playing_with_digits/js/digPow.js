function digPow(n, p){
    let s = n.toString().split('');
    let sum = 0;
    for (let i = 0; i < s.length; ++i, ++p)
    sum += Math.pow(s[i], p);
    return (sum % n === 0) ? sum / n : -1;
}

module.exports = digPow;