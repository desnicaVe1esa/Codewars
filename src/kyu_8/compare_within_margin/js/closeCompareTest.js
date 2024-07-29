const { assert } = require("chai");
const closeCompare = require("./closeCompare");

describe("Tests", () => {
    it("Sample tests", () => {
        assert.strictEqual(closeCompare(4, 5), -1)
        assert.strictEqual(closeCompare(5, 5), 0)
        assert.strictEqual(closeCompare(6, 5), 1)
        assert.strictEqual(closeCompare(-6, -5), -1)

        assert.strictEqual(closeCompare(2, 5, 3), 0)
        assert.strictEqual(closeCompare(8.1, 5, 3), 1)
        assert.strictEqual(closeCompare(1.99, 5, 3), -1)
    });
});
