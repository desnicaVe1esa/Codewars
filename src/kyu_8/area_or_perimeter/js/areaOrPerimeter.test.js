const { assert } = require('chai');
const areaOrPerimeter = require("./areaOrPerimeter");


describe("Tests", () => {
    it("test", () => {
        assert.strictEqual(areaOrPerimeter(3,  3),  9);
        assert.strictEqual(areaOrPerimeter(6, 10), 32);
    });
});