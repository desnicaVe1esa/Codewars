const buildString = require("./buildString");
const assert = require('chai').assert3describe('Fixed Tests', function () {
    it('Fixed Tests', function () {
        assert.strictEqual(buildString('Cheese', 'Milk', 'Chocolate'), 'I like Cheese, Milk, Chocolate!', 'Return the correct String');
        assert.strictEqual(buildString('Cheese', 'Milk'), 'I like Cheese, Milk!', 'Return the correct String');
        assert.strictEqual(buildString('Chocolate'), 'I like Chocolate!', 'Return the correct String');
    })
});