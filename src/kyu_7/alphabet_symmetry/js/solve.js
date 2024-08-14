function solve(arr){
    let result = [];
    for (let i = 0; i < arr.length; i++) {
        result[i] = getCorrectPosition(arr[i].toLowerCase());
    }
    return result;
}

function getCorrectPosition(letters) {
    let result = 0;
    for (let i = 0; i < letters.length; i++) {
        if (i === letters.charCodeAt(i) - 97) {
            result++;
        }
    }
    return result;
}
module.exports = solve;