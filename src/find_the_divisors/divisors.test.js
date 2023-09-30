const Test = require('@codewars/test-compat');
const divisors = require("./divisors");

describe("Tests", () => {
    it("test", () => {
        Test.assertDeepEquals(divisors(15), [3, 5]);
        Test.assertDeepEquals(divisors(12), [2, 3, 4, 6]);
        Test.assertDeepEquals(divisors(13), "13 is prime");
    });
});
