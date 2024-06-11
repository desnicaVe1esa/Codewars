const Test = require('@codewars/test-compat');
const nextBigger = require("./nextBigger");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(nextBigger(12),21)
        Test.assertEquals(nextBigger(513),531)
        Test.assertEquals(nextBigger(2017),2071)
        Test.assertEquals(nextBigger(414),441)
        Test.assertEquals(nextBigger(144),414)
    });
});
