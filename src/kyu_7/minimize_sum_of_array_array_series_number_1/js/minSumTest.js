const Test = require('@codewars/test-compat');
const minSum = require("./minSum");

describe("Basic Tests", function(){
    it("should return the minimum sum", function(){
        Test.assertEquals(minSum([5,4,2,3]), 22);
        Test.assertEquals(minSum([12,6,10,26,3,24]), 342);
        Test.assertEquals(minSum([9,2,8,7,5,4,0,6]), 74);
    });
});