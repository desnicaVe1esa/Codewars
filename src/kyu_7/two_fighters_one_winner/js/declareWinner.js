function declareWinner(fighter1, fighter2, firstAttacker) {
    let first = fighter1;
    let twice = fighter2;
    if (firstAttacker === fighter2.name) {
        first = fighter2;
        twice = fighter1;
    }
    while (true) {
        if ((twice.health -= first.damagePerAttack) <= 0) return first.name;
        if ((first.health -= twice.damagePerAttack) <= 0) return twice.name;
    }
}

module.exports = declareWinner;