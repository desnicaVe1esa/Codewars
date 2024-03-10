const Test = require('@codewars/test-compat');
const sumOfN = require("./sumOfN");
describe("Tests", () => {
    it("test", () => {
        Test.assertDeepEquals(sumOfN(3), [0, 1, 3, 6]);
        Test.assertDeepEquals(sumOfN(-4), [0, -1, -3, -6, -10]);
        Test.assertDeepEquals(sumOfN(1), [0, 1]);
        Test.assertDeepEquals(sumOfN(-6), [0, -1, -3, -6, -10, -15, -21]);
    });
});