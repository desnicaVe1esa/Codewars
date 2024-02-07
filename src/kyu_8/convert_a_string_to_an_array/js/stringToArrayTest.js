const chai = require("chai");
const stringToArray = require("./stringToArray");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.deepEqual(stringToArray("Robin Singh"), ["Robin", "Singh"]);
        assert.deepEqual(stringToArray("I love arrays they are my favorite"), ["I", "love", "arrays", "they", "are", "my", "favorite"]);
    });
});
