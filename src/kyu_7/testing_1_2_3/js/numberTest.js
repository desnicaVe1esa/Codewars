const chai = require("chai");
const number = require("./number");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Tests", () => {
    it("test", () => {
        assert.deepEqual(number([]), [], 'Empty array should return empty array');
        assert.deepEqual(number(["a", "b", "c"]), ["1: a", "2: b", "3: c"], 'Return the correct line numbers');
    });
});
