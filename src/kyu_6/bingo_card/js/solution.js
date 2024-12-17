function getCard() {
    let arr = [];
    for (let i = 0; i < 5; i++) {
        let output = `B${getRandomNumber(1, 15)}`
        if (!arr.includes(output)) {
            arr.push(output)
        } else {
            i--
        }
    }
    for (let i = 0; i < 5; i++) {
        let output = `I${getRandomNumber(16, 30)}`
        if (!arr.includes(output)) {
            arr.push(output)
        } else {
            i--
        }
    }
    for (let i = 0; i < 5; i++) {
        let output = `N${getRandomNumber(31, 45)}`
        if (i === 2) {
        } else if (!arr.includes(output)) {
            arr.push(output)
        } else {
            i--
        }
    }
    for (let i = 0; i < 5; i++) {
        let output = `G${getRandomNumber(46, 60)}`
        if (!arr.includes(output)) {
            arr.push(output)
        } else {
            i--
        }
    }
    for (let i = 0; i < 5; i++) {
        let output = `O${getRandomNumber(61, 75)}`
        if (!arr.includes(output)) {
            arr.push(output)
        } else {
            i--
        }
    }
    return arr
}

function getRandomNumber(min, max) {
    min = Math.ceil(min);
    max = Math.floor(max);
    return Math.floor(Math.random() * (max - min + 1)) + min;
}