const Test = require('@codewars/test-compat');
const move = require("./move");

describe('move function', () => {
    it('basic tests', () => {
        Test.assertEquals(move(0, 4), 8);
        Test.assertEquals(move(3, 6), 15);
        Test.assertEquals(move(2, 5), 12);
    })
})