const chai = require("chai");
const solve = require("./solve");
const assert = chai.assert;
chai.config.truncateThreshold = 0;

describe("Basic tests", function () {
    it("Should pass sample tests", function () {
        assert.strictEqual(solve("zodiac"), 26);
        assert.strictEqual(solve("chruschtschov"), 80);
        assert.strictEqual(solve("khrushchev"), 38);
        assert.strictEqual(solve("strength"), 57);
        assert.strictEqual(solve("catchphrase"), 73);
        assert.strictEqual(solve("twelfthstreet"), 103);
        assert.strictEqual(solve("mischtschenkoana"), 80);
        assert.strictEqual(solve("az"), 26);
    });
});