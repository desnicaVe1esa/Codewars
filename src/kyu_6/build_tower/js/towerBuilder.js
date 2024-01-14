function towerBuilder(nFloors) {
    let result = [];
    let width = nFloors * 2 - 1;
    for (let i = 0; i < nFloors; i++) {
        let stars = i * 2 + 1;
        let spaces = (width - stars) / 2;
        let floor = '';
        for (let j = 0; j < spaces; j++) {
            floor += (' ');
        }
        for (let j = 0; j < stars; j++) {
            floor += ('*');
        }
        for (let j = 0; j < spaces; j++) {
            floor += (" ");
        }
        result[i] = floor.toString();
    }
    return result;
}

module.exports = towerBuilder;