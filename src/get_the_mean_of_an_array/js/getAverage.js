function getAverage(marks){
    let sum = marks.reduce((x, y) => x + y);
    return Math.floor(sum / marks.length);
}

module.exports = getAverage;