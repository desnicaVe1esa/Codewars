function move (position, roll) {
    return position + (roll * 2);
}

module.exports = move;