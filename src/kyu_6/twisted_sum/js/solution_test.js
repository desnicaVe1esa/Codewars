const { assert } = require("chai");
const twistedSum = require("./solution");

describe("Twisted sum sample tests", () => {
    it("Sample test 1", () => { assert.strictEqual(twistedSum(3), 6, "n = 3"); });
    it("Sample test 2", () => { assert.strictEqual(twistedSum(10), 46, "n = 10"); });
    it("Sample test 3", () => { assert.strictEqual(twistedSum(11), 48, "n = 11"); });
    it("Sample test 4", () => { assert.strictEqual(twistedSum(12), 51, "n = 12"); });
});