import pyramid from "./pyramid";

describe('basic tests', () => {
    it("Testing for 0", () => assert.deepEqual(pyramid(0), []));
    it("Testing for 1", () => assert.deepEqual(pyramid(1), [[1]]));
    it("Testing for 2", () => assert.deepEqual(pyramid(2), [[1], [1, 1]]));
    it("Testing for 3", () => assert.deepEqual(pyramid(3), [[1], [1, 1], [1, 1, 1]]));
});