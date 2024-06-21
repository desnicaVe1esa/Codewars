const chai = require("chai");
const validateUsr = require("./validateUsr");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(validateUsr('asddsa'), true);
        assert.strictEqual(validateUsr('a'), false);
        assert.strictEqual(validateUsr('Hass'), false);
        assert.strictEqual(validateUsr('Hasd_12assssssasasasasasaasasasasas'), false);
        assert.strictEqual(validateUsr(''), false);
        assert.strictEqual(validateUsr('____'), true);
        assert.strictEqual(validateUsr('012'), false);
        assert.strictEqual(validateUsr('0123'), true);
        assert.strictEqual(validateUsr('1234567890abcdefg'), false);
        assert.strictEqual(validateUsr('p1pp1'), true);
        assert.strictEqual(validateUsr('asd43 34'), false);
        assert.strictEqual(validateUsr('asd43_34'), true);
        assert.strictEqual(validateUsr('abcd'), true);
    });
});