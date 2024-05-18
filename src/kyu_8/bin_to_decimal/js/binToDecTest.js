const {assert} = require('chai');
const binToDec = require("./binToDec");

describe('Sample Tests', function() {
    const tests = [
        ['0', 0],
        ['1', 1],
        ['10', 2],
        ['1001001', 73],
    ];

    for (let [input, expected] of tests) {
        it(`bin = '${input}'`, function() {
            assert.strictEqual(binToDec(input), expected);
        });
    }
});