const {assert} = require('chai')
const squareArea = require("./squareArea");

describe("Example tests", () => {
    it("squareArea(2)", function () {
        assert.closeTo(squareArea(2), 1.62, 1e-2);
    });
    it("squareArea(0)", function () {
        assert.closeTo(squareArea(0), 0, 1e-2);
    });
    it("squareArea(14.05)", function () {
        assert.closeTo(squareArea(14.05), 80, 1e-2);
    });
});