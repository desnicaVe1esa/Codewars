const shortcut = require("./shortcut");
const strictEqual = require('chai').assert.strictEqual;

function doTest (input, expected) {
    const actual = shortcut(input);
    strictEqual(actual, expected, `for "${input}":\n`);
}

describe("Sample Tests", () => {
    it("Should pass sample tests", () => {
        doTest('hello', 'hll');
        doTest('how are you today?', 'hw r y tdy?');
        doTest('complain', 'cmpln');
        doTest('never', 'nvr');
    });
});