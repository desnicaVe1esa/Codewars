const Test = require('@codewars/test-compat');
const century = require("./century");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(century(1705), 18, 'Testing for year 1705');
        Test.assertEquals(century(1900), 19, 'Testing for year 1900');
        Test.assertEquals(century(1601), 17, 'Testing for year 1601');
        Test.assertEquals(century(2000), 20, 'Testing for year 2000');
        Test.assertEquals(century(89), 1, 'Testing for year 89');
    });
});
