function isPangram(string) {
    string = string.toLowerCase();
    let letters = {};
    for (let i = 0; i < string.length; i++) {
        let char = string[i];
        if (char >= 'a' && char <= 'z') {
            letters[char] = true;
        }
    }
    return Object.keys(letters).length === 26;
}

module.exports = isPangram;