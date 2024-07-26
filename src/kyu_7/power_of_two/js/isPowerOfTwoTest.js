const Test = require('@codewars/test-compat');
const isPowerOfTwo = require("./isPowerOfTwo");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(isPowerOfTwo(2), true)
        Test.assertEquals(isPowerOfTwo(4096), true)
        Test.assertEquals(isPowerOfTwo(5), false)
    });
});
