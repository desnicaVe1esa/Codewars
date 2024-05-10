const Test = require('@codewars/test-compat');
const greet = require("./greet");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(greet('english'), 'Welcome', "Your function should have returned 'Welcome'. Try again.");
        Test.assertEquals(greet('dutch'), 'Welkom', "Your function should have returned 'Welkom'. Try again.");
        Test.assertEquals(greet('IP_ADDRESS_INVALID'), 'Welcome', "Your function should have returned 'Welcome'. Try again.");
    });
});
