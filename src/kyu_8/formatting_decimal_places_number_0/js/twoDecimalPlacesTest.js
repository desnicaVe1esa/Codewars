const Test = require('@codewars/test-compat');
const twoDecimalPlaces = require("./twoDecimalPlaces");

describe("twoDecimalPlaces", function () {
    it("works for some examples", function () {
        Test.assertEquals(twoDecimalPlaces(4.659725356), 4.66, "didn't work for 4.659725356");
        Test.assertEquals(twoDecimalPlaces(173735326.3783732637948948), 173735326.38, "didn't work for 173735326.3783732637948948");
        Test.assertEquals(twoDecimalPlaces(4.653725356), 4.65, "didn't work for 4.653725356");
    });
});