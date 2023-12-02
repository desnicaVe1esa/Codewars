const chai = require('chai');
const count = require("./count");
const assert = chai.assert;
chai.config.truncateThreshold = 0;

describe('Sample Tests', function() {
    function test(string, expected) {
        it(`<code>'${string}'</code>`, function() {
            assert.deepEqual(count(string), expected);
        });
    }

    test('', {});
    test('a', {'a': 1});
    test('ab', {'a': 1, 'b': 1});
    test('aba', {'a': 2, 'b': 1});
    test('ABC', {'A': 1, 'B': 1, 'C': 1});
});