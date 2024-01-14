function high(x) {
    const words = x.split(' ');
    const alphabetMap = {};
    for (let i = 'a'.charCodeAt(), j = 1; i <= 'z'.charCodeAt(); i++, j++) {
        alphabetMap[i] = j;
    }
    let highestScoringWord = {word: '', score: 0};
    words.forEach(w => {
        const chars = w.split('');
        const sumOfChars = chars.reduce((count, char) => count + alphabetMap[char.charCodeAt()], 0);
        if (sumOfChars > highestScoringWord.score) {
            highestScoringWord = {word: w, score: sumOfChars};
        }
    });

    return highestScoringWord.word;
}

module.exports = high;