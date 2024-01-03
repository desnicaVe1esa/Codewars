const Test = require('@codewars/test-compat');
const greet = require("./greet");

describe("Jenny's greeting function", function(){
    it("should greet some people normally",function(){
        Test.assertEquals(greet("Jim"), "Hello, Jim!");
        Test.assertEquals(greet("Jane"), "Hello, Jane!");
        Test.assertEquals(greet("Simon"), "Hello, Simon!");
    });
    it("should greet Johnny a little bit more special",function(){
        Test.assertEquals(greet("Johnny"), "Hello, my love!");
    });
});