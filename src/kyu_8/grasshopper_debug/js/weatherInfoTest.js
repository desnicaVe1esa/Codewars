const {assert} = require('chai');
const weatherInfo = require("./weatherInfo");

describe('celsius converter', function () {
    it('should get correct answer', function () {
        assert.strictEqual(weatherInfo(50), '10 is above freezing temperature')
        assert.strictEqual(weatherInfo(23), '-5 is freezing temperature')
    })
})