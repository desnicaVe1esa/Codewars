var encryptThis = function (text) {
    if (text.length === 0) {
        return false;
    }
    const encryptedString = [];
    const words = text.split(' ');
    for (let i = 0; i < words.length; i++) {
        const word = words[i].split('');
        word.splice(0, 1, word[0].charCodeAt());
        word.splice(1, 1, words[i][word.length-1]);
        word.splice(word.length-1, 1, words[i][1]);
        encryptedString.push(word.join(''));
    }
    return encryptedString.join(' ');
}
module.exports = encryptThis;