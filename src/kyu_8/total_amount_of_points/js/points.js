function points(games) {
    let result = 0;
    for (let i = 0; i < games.length; i++) {
        let score = games[i].split(':');
        let x = score[0];
        let y = score[1];
        result += x > y ? 3 : x < y ? 0 : 1;
    }
    return result;
}

module.exports = points;