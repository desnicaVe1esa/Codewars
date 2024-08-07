const Test = require('@codewars/test-compat');
const sumStrings = require("./solution");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(sumStrings('123','456'),'579')
    });
});
