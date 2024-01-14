function longest(s1, s2) {
    let l = s1 + s2;
    let unique = [...new Set(l)];
    return unique.sort().toString().split(",").join("");
}

module.exports = longest;