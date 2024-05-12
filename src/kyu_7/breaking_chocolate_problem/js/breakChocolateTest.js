const Test = require('@codewars/test-compat');
const breakChocolate = require("./breakChocolate");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(breakChocolate(5, 5) , 24)
        Test.assertEquals(breakChocolate(1, 1) , 0)
    });
});
