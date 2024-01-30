const chai = require("chai");
const twoSort = require("./twoSort");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests",() =>{
    it("Testing for fixed tests", () => {
        assert.strictEqual(twoSort(["bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"]), 'b***i***t***c***o***i***n' );
        assert.strictEqual(twoSort(["turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"]), 'a***r***e');
    });
});