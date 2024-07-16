function maxMultiple(divisor, bound){
    while (bound % divisor !== 0) {
        bound--;

    }
    return bound;
}

module.exports = maxMultiple;