const Test = require('@codewars/test-compat');
const factorial = require("./factorial");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(factorial(0), 1, "factorial for 0 is 1");
        Test.assertEquals(factorial(1), 1, "factorial for 1 is 1");
        Test.assertEquals(factorial(2), 2, "factorial for 2 is 2");
        Test.assertEquals(factorial(3), 6, "factorial for 3 is 6");
    });
});