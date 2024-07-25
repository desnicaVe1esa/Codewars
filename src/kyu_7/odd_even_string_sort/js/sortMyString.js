function sortMyString(S) {
        return even(S) + " " + odd(S);
}

/* Получает все четные буквы */
function even(s) {
    let evens = '';
    for (let i = 0; i < s.length; i++) {
        if (i % 2 === 0) {
            evens += s[i];
        }
    }
    return evens;
}

/* Получает все нечетные буквы */
function odd(s) {
    let odds = '';
    for (let i = 0; i < s.length; i++) {
        if (i % 2 !== 0) {
            odds += s[i];
        }
    }
    return odds
}

module.exports = sortMyString;