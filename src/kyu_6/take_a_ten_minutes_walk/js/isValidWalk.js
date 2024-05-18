function isValidWalk(walk) {
    if (walk.length !== 10) {
        return false;
    }
    let x = 0;
    let y = 0;
    for (let i = 0; i < walk.length; i++) {
        if (walk[i] === 'n') {
            y += 1;
        } else if (walk[i] === 's'){
            y -= 1;
        } else if (walk[i] === 'e') {
            x += 1;
        } else if (walk[i] === 'w') {
            x -= 1;
        }
    }
    return x === 0 && y === 0;
}
module.exports = isValidWalk;