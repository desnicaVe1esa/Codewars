function timeMath(time1, op, time2) {
    let time1Parser = timeParser(time1);
    let time2Parser = timeParser(time2);
    let seconds1 = time1Parser.reduce((a, b) => a + b);
    let seconds2 = time2Parser.reduce((a, b) => a + b);
    let operation = calculate(seconds1, seconds2, op);
    return result(operation);
}

function timeParser(time) {
    let result = [];
    let prepared = time.split(":");
    result.push(prepared[0] * 3600)
    result.push(prepared[1] * 60)
    result.push(prepared[2] * 1)
    return result;
}

function calculate(time1, time2, op) {
    return op === "+" ? ~~time1 + ~~time2 : ~~time1 - ~~time2;
}

function result(operation) {
    let total = operation < 0 ? (23 * 3600 + 59 * 60 + 60) - Math.abs(operation) : operation;
    return formatTime(total / 3600 === 24 ? 0
            : total / 3600 > 24 ? (total / 3600) - 24
                : total / 3600) +
        ":" +
        formatTime((total % 3600) / 60) +
        ":" +
        formatTime(total % 60);
}

function formatTime(time) {
    return Math.trunc(time).toString().length < 2 ? "0" + Math.trunc(time) : Math.trunc(time);
}

module.exports = timeMath;