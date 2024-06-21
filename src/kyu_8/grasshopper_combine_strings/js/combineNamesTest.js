const Test = require('@codewars/test-compat');
const combineNames = require("./combineNames");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(combineNames('James', 'Stevens'), 'James Stevens')
    });
});