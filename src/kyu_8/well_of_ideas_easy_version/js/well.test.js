const chai = require("chai");
const well = require("./well");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(well(['bad', 'bad', 'bad']), 'Fail!');
        assert.strictEqual(well(['good', 'bad', 'bad', 'bad', 'bad']), 'Publish!');
        assert.strictEqual(well(['good', 'bad', 'bad', 'bad', 'bad', 'good', 'bad', 'bad', 'good']), 'I smell a series!');
    });
});

