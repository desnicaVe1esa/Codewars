const Test = require('@codewars/test-compat');

const {assert} = require("chai");
const spacify = require("./spacify");

describe("spacify", function() {
    it("basic tests", function() {
        assert.equal(spacify('hello world'),'h e l l o   w o r l d');
        assert.equal(spacify('12345'),'1 2 3 4 5');
    });
});
