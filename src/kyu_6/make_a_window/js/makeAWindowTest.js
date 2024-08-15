const { assert } = require('chai');
const makeAWindow = require("./makeAWindow");

describe('Make window tests', () => {
    it('Sample test', () => {
        assert.strictEqual(makeAWindow(3), "---------\n|...|...|\n|...|...|\n|...|...|\n|---+---|\n|...|...|\n|...|...|\n|...|...|\n---------");
    });
});