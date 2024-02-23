const chai = require("chai");
const pipeFix = require("./pipeFix");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.deepEqual(pipeFix([1,2,3,5,6,8,9]),[1,2,3,4,5,6,7,8,9]);
        assert.deepEqual(pipeFix([1,2,3,12]),[1,2,3,4,5,6,7,8,9,10,11,12]);
        assert.deepEqual(pipeFix([6,9]),[6,7,8,9]);
        assert.deepEqual(pipeFix([-1,4]),[-1,0,1,2,3,4]);
        assert.deepEqual(pipeFix([1,2,3]),[1,2,3]);
    });
});