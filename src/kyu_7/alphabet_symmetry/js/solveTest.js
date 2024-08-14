const assert = require("assert");
const solve = require("./solve");

describe("Basic tests", () => {
    it("Fixed tests", () => {
        assert.deepEqual(solve(["abode","ABc","xyzD"]),[4,3,1]);
        assert.deepEqual(solve(["abide","ABc","xyz"]),[4,3,0]);
        assert.deepEqual(solve(["IAMDEFANDJKL","thedefgh","xyzDEFghijabc"]),[6, 5, 7]);
        assert.deepEqual(solve(["encode","abc","xyzD","ABmD"]),[1, 3, 1, 3]);
    });
});