function playPass(s, n) {
    return s
        .replace(/[A-Z]/g, function(char) {
            return String.fromCharCode((char.charCodeAt(0) - 65 + n) % 26 + 65);
        })
        .replace(/[a-z]/g, function(char) {
            return String.fromCharCode((char.charCodeAt(0) - 97 + n) % 26 + 97);
        })
        .replace(/\d/g, function(digit) {
            return 9 - digit;
        })
        .replace(/(.)(.?)/g, function(match, odd, even) {
            return odd.toUpperCase() + even.toLowerCase();
        })
        .split('').reverse().join('');
}

module.exports = playPass;