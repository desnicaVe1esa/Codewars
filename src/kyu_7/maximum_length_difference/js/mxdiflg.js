function mxdiflg(a1, a2) {
    let result = -1;
    for (let i = 0; i < a1.length; i++) {
        for (let j = 0; j < a2.length; j++) {
            result = Math.max(result, Math.abs(a1[i].length - a2[j].length));
        }
    }
    return result;
}

module.exports = mxdiflg;