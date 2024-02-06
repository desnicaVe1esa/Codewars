function remove(string) {
    let exclamationMarks = '';
    let newSentence = '';

    for (let i = 0; i < string.length; i++) {
        if (string[i] === '!') {
            exclamationMarks += '!';
        } else {
            newSentence += string[i];
        }
    }

    return newSentence + exclamationMarks;
}

module.exports = remove;
