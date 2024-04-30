const Test = require('@codewars/test-compat');
const booleanToString = require("./booleanToString");
describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(booleanToString(true), "true", 'When we pass in true, we want the string "true" as output');
        Test.assertEquals(booleanToString(false), "false", 'When we pass in false, we want the string "false" as output');
    });
});
