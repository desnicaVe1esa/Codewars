const chai = require('chai');
const assert = chai.assert;
const nearestSq = require("./nearestSq")
describe("Find Nearest square number", () => {
    it("Sample tests", () => {
        assert.strictEqual(nearestSq(1), 1, "nearestSq(1) = 1");
        assert.strictEqual(nearestSq(2), 1, "nearestSq(2) = 1");
        assert.strictEqual(nearestSq(10), 9, "nearestSq(10) = 9");
        assert.strictEqual(nearestSq(111), 121, "nearestSq(111) = 121");
        assert.strictEqual(nearestSq(9999), 10000, "nearestSq(9999) = 10000");
    })
});