const chai = require("chai");
const sumMul = require("./sumMul");
const assert = chai.assert;
chai.config.truncateThreshold = 0;
describe("Tests", () => {
    it("should test", () => {
        assert.strictEqual(sumMul(0, 0), "INVALID");
        assert.strictEqual(sumMul(2, 9), 20);
        assert.strictEqual(sumMul(4, -7), "INVALID");
    });
});
