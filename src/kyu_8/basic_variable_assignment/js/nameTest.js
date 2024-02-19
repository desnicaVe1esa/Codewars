const { assert } = require("chai")
const name = require("./name");

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(name, "codewa.rs");
    })
})