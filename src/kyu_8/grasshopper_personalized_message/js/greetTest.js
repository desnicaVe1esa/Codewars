const Test = require('@codewars/test-compat');
const greet = require("./greet");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(greet('Daniel', 'Daniel'), 'Hello boss')
        Test.assertEquals(greet('Greg', 'Daniel'), 'Hello guest')
    });
});
