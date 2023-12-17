const chai = require("chai");
const sharedBits = require("./sharedBits");
const assert = chai.assert;

const TESTS = [
    // [1, 2, false],
    [16, 8, false],
    [1, 1, false],
    [2, 3, false],
    [7, 10, false],
    [43, 77, true],
    [7, 15, true],
    [23, 7, true],
];

describe("Sample tests", () =>
    it(`${TESTS.length} fixed tests`, () =>
        TESTS.forEach(([a, b, c]) =>
            assert.strictEqual(sharedBits(a, b), c, `sharedBits(${a}, ${b}) should be equal ${c}`)
        )
    )
);
