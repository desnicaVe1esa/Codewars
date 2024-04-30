const {assert} = require("chai");
const xor = require("./xor");

describe("Your 'xor' function/operator", () => {
    it("should work for the four basic cases described above", () => {
        assert.strictEqual(xor(false, false), false, "false xor false");
        assert.strictEqual(xor(true, false), true, "true xor false");
        assert.strictEqual(xor(false, true), true, "false xor true");
        assert.strictEqual(xor(true, true), false, "true xor true");
        assert.notStrictEqual(xor(true, true), true, "true xor true: 'xor' is NOT identical to 'or'");
    });
});