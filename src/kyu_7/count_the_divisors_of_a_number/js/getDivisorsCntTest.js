const getDivisorsCnt = require("./getDivisorsCnt");
const assert = require('chai').assert;

describe("Tests", () => {
    it("test", () => {
        assert.strictEqual(getDivisorsCnt(1), 1);
        assert.strictEqual(getDivisorsCnt(10), 4);
        assert.strictEqual(getDivisorsCnt(11), 2);
        assert.strictEqual(getDivisorsCnt(54), 8);
    });
});