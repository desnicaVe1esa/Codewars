const { remove } = require("./remove");
const { strictEqual } = require("chai").assert;


describe("tests suite", function () {

    function doTest(input, expected) {
        const actual = remove(input);
        strictEqual(actual, expected, `for string:\n"${input}"\n`);
    }

    it("sample tests", function () {
        doTest("Hi!", "Hi!");
        doTest("Hi! Hi!", "Hi Hi!!");
        doTest("Hi! Hi! Hi!", "Hi Hi Hi!!!");
        doTest("Hi! !Hi Hi!", "Hi Hi Hi!!!");
        doTest("Hi! Hi!! Hi!", "Hi Hi Hi!!!!");
    });
});