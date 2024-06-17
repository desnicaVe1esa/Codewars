const chai = require("chai");
const filterString = require("./filterString");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Sample Tests", function() {
    it("should pass some fixed tests", function() {
        assert.strictEqual(filterString("123"), 123, `For the input "123"`);
        assert.strictEqual(filterString("a1b2c3"), 123, `For the input "a1b2c3"`);
        assert.strictEqual(filterString("aa1bb2cc3dd"), 123, `For the input "aa1bb2cc3dd"`);
    });
});
