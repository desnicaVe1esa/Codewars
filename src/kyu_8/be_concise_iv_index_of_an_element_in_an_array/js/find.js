function find(a, b) {
    return a.indexOf(b) >= 0 ? a.indexOf(b) : "Not found";
}

module.exports = find;