const Test = require('@codewars/test-compat');
const God = require("./God");
const Man = require("./God");

describe("GodTest", function() {
    it("Adam should be a Man", function() {
        let humans = God.create()
        Test.assertEquals(humans[0] instanceof Man, true, 'Expected Adam to be a Man');
    });
});
