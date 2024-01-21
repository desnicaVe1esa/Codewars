function sumDigPow(a, b) {
    let res = [];
    for (let i = a; i < b; i++) {
        if (isEurika(i)) {
            res.push(i);
        }
    }
    return res;
}

const isEurika = (i) => {
    let a = i.toString();
    let sum = 0;
    for (let j = 0; j < a.length; j++) {
        sum += Math.pow(a[j], j + 1);
    }

    return sum === i;
}

module.exports = sumDigPow;