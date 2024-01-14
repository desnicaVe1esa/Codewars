const Test = require('@codewars/test-compat');
const digPow = require("./digPow");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(digPow(89, 1), 1)
        Test.assertEquals(digPow(92, 1), -1)
        Test.assertEquals(digPow(46288, 3), 51)

    });
});