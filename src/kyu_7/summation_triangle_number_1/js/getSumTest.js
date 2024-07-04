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
        act(1n,7n);
        act(2n,22n);
        act(3n,50n);
    });
    describe('Medium tests', () => {
        act(100n,691951n);
        act(500n,83959751n);
        act(1000n,669169501n);
    });
    describe('Large tests', () => {
        act(10000n,666916695001n);
        act(100000n,666691666950001n);
        act(1000000n,666669166669500001n);
    });
});