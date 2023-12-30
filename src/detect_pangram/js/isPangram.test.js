const chai = require("chai");
const assert = chai.assert;
const isPangram = require("./isPangram");
chai.config.truncateThreshold = 0;

describe("Tests", () => {
    it("test1", () => {
        var string = "The quick brown fox jumps over the lazy dog."
        assert.strictEqual(isPangram(string), true)
    })
    it("test2", () => {
        var string = "This is not a pangram."
        assert.strictEqual(isPangram(string), false)
    });
});