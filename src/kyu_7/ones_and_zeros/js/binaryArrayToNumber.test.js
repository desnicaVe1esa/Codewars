const Test = require('@codewars/test-compat');
const binaryArrayToNumber = require("./binaryArrayToNumber");

describe("One's and Zero's", () => {
    it("Example tests", () => {
        Test.assertEquals(binaryArrayToNumber([0,0,0,1]), 1);
        Test.assertEquals(binaryArrayToNumber([0,0,1,0]), 2);
        Test.assertEquals(binaryArrayToNumber([1,1,1,1]), 15);
        Test.assertEquals(binaryArrayToNumber([0,1,1,0]), 6);
    });
});