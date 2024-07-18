const { assert } = require('chai');
const add = require("./solution");

describe("Silly addition", () => {
    it("Real addition", () => {
        assert.strictEqual(add(2, 11), 13);
        assert.strictEqual(add(0, 1), 1);
        assert.strictEqual(add(0, 0), 0);
    });

    it("Silly addition", () => {
        assert.strictEqual(add(16, 18), 214);
        assert.strictEqual(add(26, 39), 515);
        assert.strictEqual(add(122, 81), 1103);
    });

    it("Big addition", () => {
        assert.strictEqual(add(1222, 30277), 31499);
        assert.strictEqual(add(1236, 30977), 31111013);
        assert.strictEqual(add(38810, 1383), 391193);
        assert.strictEqual(add(49999, 49999), 818181818);
    });
});
