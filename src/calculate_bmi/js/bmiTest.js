const Test = require('@codewars/test-compat');
const bmi = require("./bmi");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(bmi(80, 1.80), "Normal");
    });
});
