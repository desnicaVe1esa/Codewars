const Test = require('@codewars/test-compat');
const isDigit = require("./isDigit");

describe("Solution", function(){
    it("basic tests", function(){
        var input = "s2324";
        Test.assertEquals(isDigit(input), false);

        input = "-234.4";
        Test.assertEquals(isDigit(input), true);
    });
});