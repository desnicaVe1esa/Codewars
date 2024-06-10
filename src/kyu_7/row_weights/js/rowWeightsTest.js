const chai = require("chai");
const rowWeights = require("./rowWeights");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.deepEqual(rowWeights([80]), [80,0]);
        assert.deepEqual(rowWeights([100,50]), [100,50]);
        assert.deepEqual(rowWeights([50,60,70,80]), [120,140]);
        assert.deepEqual(rowWeights([13,27,49]), [62,27]);
        assert.deepEqual(rowWeights([70,58,75,34,91]), [236,92]);
        assert.deepEqual(rowWeights([29,83,67,53,19,28,96]), [211,164]);
        assert.deepEqual(rowWeights([0]), [0,0]);
        assert.deepEqual(rowWeights([100,51,50,100]), [150,151]);
        assert.deepEqual(rowWeights([39,84,74,18,59,72,35,61]), [207,235]);
        assert.deepEqual(rowWeights([0,1,0]), [0,1]);
    })
})
