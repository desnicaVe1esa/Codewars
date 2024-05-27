const chai = require('chai');
const solution = require("./solution");
const assert = chai.assert;

describe("solution", function(){
    it ("should handle small numbers", function(){
        assert.strictEqual(solution(1), 'I', '1 should return "I"')
        assert.strictEqual(solution(2), 'II', '2 should return "II"')
        assert.strictEqual(solution(3), 'III', '3 should return "III"')
        assert.strictEqual(solution(4), 'IV', '4 should return "IV"')
        assert.strictEqual(solution(5), 'V', '5 should return "V"')
        assert.strictEqual(solution(9), 'IX', '9 should return "IX"')
        assert.strictEqual(solution(10), 'X', '10 should return "X"')
        assert.strictEqual(solution(11), 'XI', '11 should return "XI"')
        assert.strictEqual(solution(19), 'XIX', '19 should return "XIX"')
        assert.strictEqual(solution(22), 'XXII', '22 should return "XXII"')
        assert.strictEqual(solution(15), 'XV', '15 should return "XV"')
    });

    it ("should handle large numbers", function(){
        assert.strictEqual(solution(1000), 'M', '1000 should, "M"')
        assert.strictEqual(solution(1001), 'MI', '1001 should, "MI"')
        assert.strictEqual(solution(1990), 'MCMXC', '1990 should, "MCMXC"')
        assert.strictEqual(solution(2007), 'MMVII', '2007 should, "MMVII"')
        assert.strictEqual(solution(2008), 'MMVIII', '2008 should, "MMVIII"')
    });
});