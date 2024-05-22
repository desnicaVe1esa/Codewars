function makeMeSlow() {
    return Array.from({ length: 50000000 }, (el, i) => i + el);
}
module.exports = makeMeSlow;