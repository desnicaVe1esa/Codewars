const chai = require("chai");
const setAlarm = require("./setAlarm");
const assert = chai.assert;
chai.config.truncateThreshold = 0;

describe("Test Suite", () => {
    it("Fixed tests", () => {
        assert.strictEqual(setAlarm(true, true), false, "Should be false.");
        assert.strictEqual(setAlarm(false, true), false, "Should be false.");
        assert.strictEqual(setAlarm(true, false), true, "Should be true.");
    });
});
