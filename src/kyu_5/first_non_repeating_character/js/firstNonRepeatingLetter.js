function firstNonRepeatingLetter(s) {
    for (let str of s.split('')) {
        if (s.toUpperCase().indexOf(str.toUpperCase()) === s.toUpperCase().lastIndexOf(str.toUpperCase())) {
            return str;
        }
    }
    return '';
}

module.exports = firstNonRepeatingLetter;