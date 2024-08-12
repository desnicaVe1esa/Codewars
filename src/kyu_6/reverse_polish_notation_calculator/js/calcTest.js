const { assert } = require('chai')
const calc = require("./calc");

describe('calc', function () {
    it('Should work for sample tests', function () {
        assert.approximately(calc(''), 0, 1e-6, 'Should work with empty string')
        assert.approximately(calc('3'), 3, 1e-6, 'Should parse numbers')
        assert.approximately(calc('3.5'), 3.5, 1e-6, 'Should parse float numbers')
        assert.approximately(calc('1 3 +'), 4, 1e-6, 'Should support addition')
        assert.approximately(calc('1 3 *'), 3, 1e-6, 'Should support multiplication')
        assert.approximately(calc('1 3 -'), -2, 1e-6, 'Should support subtraction')
        assert.approximately(calc('4 2 /'), 2, 1e-6, 'Should support division')
    })
})