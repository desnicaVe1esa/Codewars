const { assert } = require('chai');
const addLetters = require("./addLetters");

describe("Fixed tests", () => {
    const tests = [
        [['a', 'b', 'c'], 'f'],
        [['z'], 'z'],
        [['a', 'b'], 'c'],
        [['c'], 'c'],
        [['z', 'a'], 'a'],
        [['y', 'c', 'b'], 'd'],
        [[], 'z']
    ];
    tests.forEach(test => {
        const str = test[0].map(x => `"${x}"`).join(', ');
        it(`addLetters(${str})`, () => {
            assert.strictEqual(addLetters(...test[0]), test[1]);
        });
    });
});