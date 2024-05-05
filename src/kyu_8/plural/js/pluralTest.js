const Test = require('@codewars/test-compat');
const plural = require("./plural");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(plural(0), true, "Plural for 0");
        Test.assertEquals(plural(0.5), true, "Plural for 0.5");
        Test.assertEquals(plural(1), false, "Plural for 1");
        Test.assertEquals(plural(100), true, "Plural for 100");
        Test.assertEquals(plural(Infinity), true, "Plural for Infinity");
    });
});
