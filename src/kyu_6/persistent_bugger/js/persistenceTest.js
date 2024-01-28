const chai = require("chai");
const persistence = require("./persistence");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Persistent Bugger.", () => {
    it("Fixed tests", () => {
        assert.strictEqual(persistence(39),3);
        assert.strictEqual(persistence(4),0);
        assert.strictEqual(persistence(25),2);
        assert.strictEqual(persistence(999),4);
    });
});