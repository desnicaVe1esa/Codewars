const largestPairSum = require("./largestPairSum");
const strictEqual = require("chai").assert.strictEqual;

function doTest(array, expected) {
    const actual = largestPairSum(array);
    strictEqual(actual, expected, `for array [${array.join(', ')}]:\n`);
}

it("Basic tests", () => {
    doTest([10, 14, 2, 23, 19], 42);
    doTest([-100, -29, -24, -19, 19], 0);
    doTest([1, 2, 3, 4, 6, -1, 2], 10);
    doTest([-10, -8, -16, -18, -19], -18);
});