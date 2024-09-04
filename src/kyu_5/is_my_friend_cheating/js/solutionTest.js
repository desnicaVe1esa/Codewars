const Test = require('@codewars/test-compat');

describe("Tests", () => {
    it("test", () => {
        Test.assertDeepEquals(removeNb(26), [[15,21], [21,15]]);
        Test.assertDeepEquals(removeNb(100), []);
    });
});
