const chai = require("chai");
const removeChar = require("./removeChar");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Tests", () => {
    it("Fixed Tests", () => {
        assert.strictEqual(removeChar('eloquent'), 'loquen');
        assert.strictEqual(removeChar('country'), 'ountr');
        assert.strictEqual(removeChar('person'), 'erso');
        assert.strictEqual(removeChar('place'), 'lac');
        assert.strictEqual(removeChar('ooopsss'), 'oopss');
    });
});
