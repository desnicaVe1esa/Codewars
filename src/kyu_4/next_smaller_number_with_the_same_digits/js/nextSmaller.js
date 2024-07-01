function nextSmaller(n) {
    let digits = ('' + n).split('');
    for (let i = digits.length - 1; i-- > 0;) {
        if (digits[i + 1] < digits[i]) {
            let tail = digits.slice(i).sort((a, b) => b - a);
            let head = tail.splice(tail.findIndex(x => x < digits[i]), 1);
            if (!i && '0' == head[0]) {
                return -1;
            }
            return +digits.slice(0, i).concat(head, tail).join('');
        }
    }
    return -1;
}

module.exports = nextSmaller;