const Test = require('@codewars/test-compat');
const seatsInTheater = require("./seatsInTheater");

describe("Basic Tests", function(){
    it("It should works for basic tests.", function(){

        Test.assertEquals(seatsInTheater(16,11,5,3) , 96)

        Test.assertEquals(seatsInTheater(1,1,1,1) , 0)

        Test.assertEquals(seatsInTheater(13,6,8,3) , 18)

        Test.assertEquals(seatsInTheater(60,100,60,1) , 99)

        Test.assertEquals(seatsInTheater(1000,1000,1000,1000) , 0)

    })})