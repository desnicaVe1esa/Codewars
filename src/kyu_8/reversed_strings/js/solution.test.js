const chai = require("chai");
const solution = require("./solution");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(solution('world'), 'dlrow');
        assert.strictEqual(solution('hello'), 'olleh');
        assert.strictEqual(solution(''), '');
        assert.strictEqual(solution('h'), 'h');
    });
});  