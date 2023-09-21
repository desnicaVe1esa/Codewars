const chai = require("chai");
const assert = chai.assert;
chai.config.truncateThreshold=0;

function describe(basicTests, param2) {}
function it(testingForFixedTests, param2) {}

describe("Basic Tests", function(){
    it("Testing for fixed tests", () => {
        assert.strictEqual(enough(10, 5, 5), 0);
        assert.strictEqual(enough(100, 60, 50), 10);
        assert.strictEqual(enough(20, 5, 5), 0);
    });
});
