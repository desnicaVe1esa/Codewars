const { assert } = require('chai');
const square = require("./square");

describe("Tests", () => {
    it("test", () => {
        assert.strictEqual(square(3), 9);
    });
});