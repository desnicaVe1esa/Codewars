const { assert } = require("chai")

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.deepEqual(sortme(['one', 'two', 'three' ]), ["one", "three", "two"])
    })
})