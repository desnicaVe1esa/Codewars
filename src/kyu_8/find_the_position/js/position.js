function position(letter){
    return "Position of alphabet: " + (letter.charCodeAt(0) - 'a'.charCodeAt(0) + 1);
}

module.exports = position;