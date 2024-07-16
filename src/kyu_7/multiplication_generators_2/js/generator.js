function* generator(a) {
    let num = 0
    while (++num) {
        yield `${a} x ${num} = ${a * num}`
    }
}

module.exports = generator;