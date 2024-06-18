function score(s) {
    let alph = "abcdefghijklmnopqrstuvwxyz";
    let sum = 0;
    for (let el of s) {
        sum += alph.indexOf(el) + 1;
    }
    return sum + s.length;
}

function rank(st, we, n) {
    if (st === "") {
        return "No participants"
    }
    let s = st.split(',')
    if (n > s.length) {
        return "Not enough participants"
    }
    let st1 = st.toLowerCase().split(",");
    let w = st1.map((el, i) => [s[i], score(el) * we[i]])
    w.sort((a, b) => b[1] > a[1] ? 1 : b[1] < a[1] ? -1 : a[0] > b[0] ? 1 : -1)
    return w[n - 1][0]
}

module.exports = rank;