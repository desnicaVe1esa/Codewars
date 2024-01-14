const Test = require('@codewars/test-compat');
const addBinary = require("./addBinary");

describe("addBinary(1,2)", function() {
    let results1 = addBinary(1, 2);
    it("Should return something that isn't falsy", function() {
        Test.expect(results1, "Something is wrong, no results!");
    });
    it("Should return \"11\"", function() {
        Test.assertEquals(results1, "11");
    });
});