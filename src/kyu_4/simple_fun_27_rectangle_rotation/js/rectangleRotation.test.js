const Test = require('@codewars/test-compat');
const rectangleRotation = require("./rectangleRotation");

describe("Basic Tests", function () {
    it("It should works for basic tests.", function () {

        Test.assertEquals(rectangleRotation(6, 4), 23)

        Test.assertEquals(rectangleRotation(30, 2), 65)

        Test.assertEquals(rectangleRotation(8, 6), 49)

        Test.assertEquals(rectangleRotation(16, 20), 333)

    })
})