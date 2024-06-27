const {assert} = require('chai');
const cleanString = require("./cleanString");

describe("cleanString", () => {
    it("should work correctly", () => {
        assert.strictEqual(cleanString('abc#d##c'), 'ac');
        assert.strictEqual(cleanString('abc####d##c#'), '');
    });
});