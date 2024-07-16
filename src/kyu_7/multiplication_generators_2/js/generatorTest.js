const chai = require("chai");
const generator = require("./generator");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Fixed Tests", () => {
    it("Basic Test Cases", function() {
        let gen = generator(1);
        assert.strictEqual(gen.next().value, '1 x 1 = 1', '1 x 1 = 1');
        assert.strictEqual(gen.next().value, '1 x 2 = 2', '1 x 2 = 2');
        assert.strictEqual(gen.next().value, '1 x 3 = 3', '1 x 3 = 3');
        assert.strictEqual(gen.next().value, '1 x 4 = 4', '1 x 4 = 4');
        assert.strictEqual(gen.next().value, '1 x 5 = 5', '1 x 5 = 5');
    });
});