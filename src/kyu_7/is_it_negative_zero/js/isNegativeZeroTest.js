const Test = require('@codewars/test-compat');
const isNegativeZero = require("./isNegativeZero");

describe("Basic Tests", function() {
    it("should return true for -0", function() {
        Test.assertEquals(isNegativeZero(-0), true);
    });

    it("should return false for non-negative-zero numbers", function() {
        Test.assertEquals(isNegativeZero(-Infinity), false);
        Test.assertEquals(isNegativeZero(-5), false);
        Test.assertEquals(isNegativeZero(-4), false);
        Test.assertEquals(isNegativeZero(-3), false);
        Test.assertEquals(isNegativeZero(-2), false);
        Test.assertEquals(isNegativeZero(-1), false);
        Test.assertEquals(isNegativeZero(-Number.MIN_VALUE), false);
        Test.assertEquals(isNegativeZero(0), false);
        Test.assertEquals(isNegativeZero(Number.MIN_VALUE), false);
        Test.assertEquals(isNegativeZero(1), false);
        Test.assertEquals(isNegativeZero(2), false);
        Test.assertEquals(isNegativeZero(3), false);
        Test.assertEquals(isNegativeZero(4), false);
        Test.assertEquals(isNegativeZero(5), false);
        Test.assertEquals(isNegativeZero(Infinity), false);
    });
});