const Test = require('@codewars/test-compat');
const validate = require("./validate");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(validate(123), false);
        Test.assertEquals(validate(1), false);
        Test.assertEquals(validate(2121), true);
        Test.assertEquals(validate(1230), true);
    });
});
