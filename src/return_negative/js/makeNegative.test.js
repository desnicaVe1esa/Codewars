const Test = require('@codewars/test-compat');
const makeNegative = require("./makeNegative");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(makeNegative(42), -42);
    });
});