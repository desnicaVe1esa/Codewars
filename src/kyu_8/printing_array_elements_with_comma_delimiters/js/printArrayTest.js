const Test = require('@codewars/test-compat');
const printArray = require("./printArray");

describe("Tests", () => {
    it("test", () => {
        var data = [2,4,5,2];
        Test.expect( printArray( data ) ==
            "2,4,5,2", "int test failed" )
    });
});
