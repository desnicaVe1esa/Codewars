const chai = require("chai");
const assert = chai.assert;
const _ = require("lodash");
const sumCubes = require("./sumCubes");
chai.config.truncateThreshold=0;

describe("Sum of Cubes", () => {
    it("Fixed tests", () => {
        _.shuffle( [
            [1, 1], [2, 9], [3, 36], [4, 100],
            [10, 3025], [123, 58155876]
        ] ).forEach(([n,exp]) => assert.strictEqual(sumCubes(n), exp))
    });
});
