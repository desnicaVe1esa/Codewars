const Test = require('@codewars/test-compat');
const growingPlant = require("./growingPlant");

describe("Basic Tests", function () {
    it("It should works for basic tests.", function () {

        Test.assertEquals(growingPlant(100, 10, 910), 10)

        Test.assertEquals(growingPlant(10, 9, 4), 1)

    })
})