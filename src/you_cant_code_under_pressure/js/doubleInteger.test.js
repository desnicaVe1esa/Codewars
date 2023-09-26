const Test = require('@codewars/test-compat');
const doubleInteger = require("./doubleInteger");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(doubleInteger(2), 4);
    });
});