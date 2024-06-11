function nextBigger(n) {
    let chars = n.toString().split('');
    let i = chars.length - 1;
    while (i > 0) {
        if (chars[i] > chars[i - 1]) break;
        i--;
    }
    if (i === 0) return -1;
    let suf = chars.splice(i).sort();
    let t = chars[chars.length - 1];
    for (i = 0; i < suf.length; ++i) {
        if (suf[i] > t) break;
    }
    chars[chars.length - 1] = suf[i]
    suf[i] = t;
    let res = chars.concat(suf);
    return parseInt(res.join(''));
}

module.exports = nextBigger;