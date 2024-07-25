const sortMyString = require("./sortMyString");
const assert = require('chai').assert3describe("Other Tests", function () {
    it("Static Ones", function () {
        assert.strictEqual(sortMyString("CodeWars"), "CdWr oeas");
        assert.strictEqual(sortMyString("YCOLUE'VREER"), "YOU'RE CLEVER");
    });
});