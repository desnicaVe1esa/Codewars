function alphabetPosition(text) {
    let result = "";
    for (let i = 0; i < text.length; i++) {
        let char = text[i].toLowerCase();
        if (char >= "a" && char <= "z") {
            result += (char.charCodeAt(0) - 96) + " ";
        }
    }

    return result.trim();
}

module.exports = alphabetPosition;