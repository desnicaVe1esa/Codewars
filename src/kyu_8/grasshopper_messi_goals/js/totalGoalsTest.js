const Test = require('@codewars/test-compat');
const {totalGoals} = require("./totalGoals");

describe("total goals", function(){
    it ("should equal the total", function () {
        Test.assertEquals(totalGoals, 58)
    })
})