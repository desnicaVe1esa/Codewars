const { assert } = require('chai');
const alphanumeric = require("./alphanumeric");

describe("Tests", () => {
    it("test", () => {
        assert.strictEqual(alphanumeric("Mazinkaiser"), true)
        assert.strictEqual(alphanumeric("hello world_"), false)
        assert.strictEqual(alphanumeric("PassW0rd"), true)
        assert.strictEqual(alphanumeric("     "), false)
    });
});
