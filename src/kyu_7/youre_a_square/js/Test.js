const Test = require('@codewars/test-compat');
const isSquare = require("./isSquare");

describe("isSquare", function () {
    it("should work for some examples", function () {
        Test.assertEquals(isSquare(-1), false, "-1: Negative numbers cannot be square numbers");
        Test.assertEquals(isSquare(0), true, "0 is a square number (0 * 0)");
        Test.assertEquals(isSquare(3), false, "3 is not a square number");
        Test.assertEquals(isSquare(4), true, "4 is a square number (2 * 2)");
        Test.assertEquals(isSquare(25), true, "25 is a square number (5 * 5)");
        Test.assertEquals(isSquare(26), false, "26 is not a square number");
    });
});