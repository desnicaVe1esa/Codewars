function sortCards(array) {
    let pattern ="A23456789TJQK";
    return array.sort((a, b) => pattern.indexOf(a) - pattern.indexOf(b));
}

module.exports = sortCards;