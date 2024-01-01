const Test = require('@codewars/test-compat');

describe("decomp",() => {
    it("5 Basic tests",() => {
        Test.assertEquals(decomp(17), "2^15 * 3^6 * 5^3 * 7^2 * 11 * 13 * 17")
        Test.assertEquals(decomp(5), "2^3 * 3 * 5")
        Test.assertEquals(decomp(22), "2^19 * 3^9 * 5^4 * 7^3 * 11^2 * 13 * 17 * 19")
        Test.assertEquals(decomp(14), "2^11 * 3^5 * 5^2 * 7^2 * 11 * 13")
        Test.assertEquals(decomp(25), "2^22 * 3^10 * 5^6 * 7^3 * 11^2 * 13 * 17 * 19 * 23")
    })
})