const {assert} = require("chai");
const basicOp = require("./basicOp");

describe("Basic tests", () => {
    it("Tests", () => {
        assert.strictEqual(basicOp("+", 4, 7), 11, "4 + 7 = 11");
        assert.strictEqual(basicOp("-", 15, 18), -3, "15 - 18 = -3");
        assert.strictEqual(basicOp("*", 5, 5), 25, "5 * 5 = 25");
        assert.strictEqual(basicOp("/", 49, 7), 7, "49 / 7 = 7");
    });
});