const Test = require('@codewars/test-compat');
const seven = require('./seven');

describe("Seven", function () {
    it("Basic tests ", function () {
        Test.assertSimilar(seven(1021), [10, 2])
        Test.assertSimilar(seven(1603), [7, 2])
        Test.assertSimilar(seven(371), [35, 1])
        Test.assertSimilar(seven(483), [42, 1])
    })
})