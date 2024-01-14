const {assert} = require('chai');
const countSheeps = require("./countSheeps");

describe('Sample Tests', function() {
    const tests = [
        [[], 0],
        [[undefined], 0],
        [[null], 0],
        [[false], 0],
        [[true], 1],
        [[undefined,null,false,true], 1],
        [[undefined,null,false,true,true,false,null,undefined], 2],
        [[true,true,true,false,true,true,true,true,true,false,true,false,true,false,false,true,true,true,true,true,false,false,true,true], 17],
    ];

    for (let [sheep, expected] of tests) {
        it(`${stringify(sheep)}`, function() {
            assert.strictEqual(countSheeps(sheep), expected);
        });
    }

    function stringify(sheep) {
        return `[${sheep.map(String).join(',')}]`;
    }
});