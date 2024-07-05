const { assert } = require('chai');

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
        act(1n,-5n);
        act(2n,10n);
        act(3n,-18n);
    });
    describe('Medium tests', () => {
        act(100n,10251n);
        act(500n,251251n);
        act(1000n,1002501n);
    });
    describe('Large tests', () => {
        act(10000n,100025001n);
        act(100000n,10000250001n);
        act(1000000n,1000002500001n);
    });
});