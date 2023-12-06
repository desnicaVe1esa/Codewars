const {assert} = require('chai');
const queueTime = require("./queueTime");

describe("Sample tests", function () {

    it("Simple tests", () => {
        assert.strictEqual(queueTime([], 1), 0);
        assert.strictEqual(queueTime([1, 2, 3, 4], 1), 10);
        assert.strictEqual(queueTime([2, 2, 3, 3, 4, 4], 2), 9);
        assert.strictEqual(queueTime([1, 2, 3, 4, 5], 100), 5);
    });

    it("Examples", () => {
        assert.strictEqual(queueTime([5, 3, 4], 1), 12);
        assert.strictEqual(queueTime([10, 2, 3, 3], 2), 10);
        assert.strictEqual(queueTime([2, 3, 10, 2], 2), 12);
    });
});