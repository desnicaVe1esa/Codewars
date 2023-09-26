const Test = require('@codewars/test-compat');
const findMissingLetter = require("./findMissingLetter");

describe("KataTests", function(){
    it("exampleTests", function(){
        Test.assertEquals(findMissingLetter(['a','b','c','d','f']), 'e');
        Test.assertEquals(findMissingLetter(['O','Q','R','S']), 'P');
    });
});