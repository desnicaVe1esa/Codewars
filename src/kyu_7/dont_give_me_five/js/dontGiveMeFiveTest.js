const Test = require('@codewars/test-compat');
const dontGiveMeFive = require("./dontGiveMeFive");

describe("KataTests", function () {
    it("exampleTests", function () {
        Test.assertEquals(dontGiveMeFive(1, 9), 8);
        Test.assertEquals(dontGiveMeFive(4, 17), 12);
    });
});