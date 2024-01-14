const nbDig = require("./nbDig");
const assert = require('chai').assert;
describe("nbDig", () => {
    it("Basic tests", () => {
        assert.strictEqual(nbDig( 5750, 0),  4700, "n = 5750, d = 0");
        assert.strictEqual(nbDig(11011, 2),  9481, "n = 11011, d = 2");
        assert.strictEqual(nbDig(12224, 8),  7733, "n = 12224, d = 8");
        assert.strictEqual(nbDig(11549, 1), 11905, "n = 11549, d = 1");
    });
});