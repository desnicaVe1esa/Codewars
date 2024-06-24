const chai = require("chai");
const adjacentElementsProduct = require("./adjacentElementsProduct");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Maximum Product", function(){
    it("Positive numbers", function() {
        assert.strictEqual(adjacentElementsProduct([5, 8]), 40);
        assert.strictEqual(adjacentElementsProduct([1, 2, 3]), 6);
        assert.strictEqual(adjacentElementsProduct([1, 5, 10, 9]), 90);
        assert.strictEqual(adjacentElementsProduct([4, 12, 3, 1, 5]), 48);
        assert.strictEqual(adjacentElementsProduct([5, 1, 2, 3, 1, 4]), 6);
    });

    it("Both positive and negative values", function() {
        assert.strictEqual(adjacentElementsProduct([3, 6, -2, -5, 7, 3]), 21);
        assert.strictEqual(adjacentElementsProduct([9, 5, 10, 2, 24, -1, -48]), 50);
        assert.strictEqual(adjacentElementsProduct([5, 6, -4, 2, 3, 2, -23]), 30);
        assert.strictEqual(adjacentElementsProduct([-23, 4, -5, 99, -27, 329, -2, 7, -921]), -14);
        assert.strictEqual(adjacentElementsProduct([5, 1, 2, 3, 1, 4]), 6);
    });

    it("Contains zeroes", function() {
        assert.strictEqual(adjacentElementsProduct([1, 0, 1, 0, 1000]), 0);
        assert.strictEqual(adjacentElementsProduct([1, 2, 3, 0]), 6);
    });
});