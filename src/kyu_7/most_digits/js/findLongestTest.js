const Test = require('@codewars/test-compat');
const findLongest = require("./findLongest");
describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(findLongest([1, 10, 100]), 100)
        Test.assertEquals(findLongest([9000, 8, 800]), 9000)
        Test.assertEquals(findLongest([8, 900, 500]), 900)
    });
});
