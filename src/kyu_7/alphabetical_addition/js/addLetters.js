function addLetters(...letters){
    const sum = letters.reduce((accumulator, currentValue) => {
        const newAccumulator = accumulator + currentValue.charCodeAt(0) - 96;
        return newAccumulator > 26 ? newAccumulator - 26 : newAccumulator;
    }, 0)

    return letters.length === 0 ? 'z' : String.fromCharCode(sum + 96);
}
module.exports = addLetters;