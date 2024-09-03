const strictEqual = require("chai").assert.strictEqual;

function doTest (input, expected) {
    const actual = remove(input);
    strictEqual(actual, expected, `for string:\n"${input}"\n`);
}

describe("Tests suite", function () {
    it("sample tests", function () {
        doTest("Hi!", "Hi!");
        doTest("Hi!!!", "Hi!");
        doTest("!Hi", "Hi!");
        doTest("!Hi!", "Hi!");
        doTest("Hi! Hi!", "Hi Hi!");
        doTest("Hi", "Hi!");
    });
});