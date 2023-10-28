const chai = require("chai");
const solution = require("./solution");
const assert = chai.assert;

describe("Sample Tests", () => {
    it("Should pass sample tests", () => {
        assert.strictEqual(solution('camelCasing'), 'camel Casing', 'Unexpected result')
        assert.strictEqual(solution('camelCasingTest'), 'camel Casing Test', 'Unexpected result')
    });
});