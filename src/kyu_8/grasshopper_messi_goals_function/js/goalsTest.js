const Test = require('@codewars/test-compat');
const goals = require("./goals");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(goals(0, 0, 0), 0)
        Test.assertEquals(goals(43, 10, 5), 58)
    });
});
