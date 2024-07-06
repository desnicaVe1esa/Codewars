const { assert } = require('chai');
const getSum = require("./getSum");

describe('Solution test', () => {
    const act = (n,expected) => {
        it(`n: ${n}`,
            () => {
                const actual = getSum(n);
                assert.strictEqual(actual, expected);
            });
    }
    describe('Small tests', () => {
        act(0n,1n);
        act(1n,-4n);
        act(2n,0n);
        act(3n,-18n);
        act(4n,-9n);
    });
    describe('Medium tests', () => {
        act(100n,-127449n);
        act(500n,-15687249n);
        act(1000n,-125249499n);
    });
    describe('Large tests', () => {
        act(10000n,-125024994999n);
        act(100000n,-125002499949999n);
        act(1000000n,-125000249999499999n);
    });
});