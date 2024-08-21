const chai = require("chai");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Your refactored find() function", () => {
    it("should behave as expected", () => {
        let array = [2,3,5,7,11];
        assert.strictEqual(find(array, 5), 2);
        assert.strictEqual(find(array, 11), 4);
        assert.strictEqual(find(array, 3), 1);
        assert.strictEqual(find(array, 2), 0);
        assert.strictEqual(find(array, 7), 3);
        assert.strictEqual(find(array, 1), "Not found");
        assert.strictEqual(find(array, 8), "Not found");
        array = [true, "Hello World", false, "Lorem Ipsum", 6, Math.PI];
        assert.strictEqual(find(array, "Hello World"), 1);
        assert.strictEqual(find(array, "lorem ipsum"), "Not found");
        assert.strictEqual(find(array, "Lorem Ipsum"), 3);
        assert.strictEqual(find(array, false), 2);
        assert.strictEqual(find(array, true), 0);
        assert.strictEqual(find(array, Math.PI), 5);
        assert.strictEqual(find(array, 3.14), "Not found");
        assert.strictEqual(find(array, 6), 4);
    });
});