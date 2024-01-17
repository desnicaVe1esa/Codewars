const Test = require('@codewars/test-compat');
const sum = require("./sum");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(sum([]), 0);
        Test.assertEquals(sum([1, 5.2, 4, 0, -1]), 9.2);
    });
});