const {castArray} = require("mocha/lib/utils");

function monkeyCount(n) {
    let result = [];
    result.length = n;
    for (let i = 0; i < result.length; i++) {
        result[i] = i + 1;
    }
    return result
}

module.exports = monkeyCount;