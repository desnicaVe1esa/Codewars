const Test = require('@codewars/test-compat');
const maskify = require("./maskify");

describe("maskify", function(){
    it("should work for some examples", function(){
        Test.assertEquals(maskify('4556364607935616'), '############5616');
        Test.assertEquals(maskify('1'), '1');
        Test.assertEquals(maskify('11111'), '#1111');
    });
});