function duplicateEncode(word){
    word = word.toLowerCase();
    let result = '';
    for (let i = 0; i < word.length; ++i) {
        let c = word.charAt(i);
        result += word.lastIndexOf(c) === word.indexOf(c) ? '(' : ')';
    }
    return result;
}

module.exports = duplicateEncode;