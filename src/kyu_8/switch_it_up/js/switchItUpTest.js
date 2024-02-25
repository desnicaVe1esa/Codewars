const chai = require("chai");
const switchItUp = require("./switchItUp");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic Tests",() =>{
    it("Testing for fixed tests", () => {
        assert.strictEqual(switchItUp(1),"One");
        assert.strictEqual(switchItUp(3),"Three");
        assert.strictEqual(switchItUp(5),"Five");
    });
});