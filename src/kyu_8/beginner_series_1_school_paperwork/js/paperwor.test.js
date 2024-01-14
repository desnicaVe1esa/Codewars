const chai = require("chai");
const paperwork = require("./paperwork");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Simple Tests", function(){
    it("Testing for fixed tests", () => {
        assert.strictEqual(paperwork(5,5), 25, 'Failed at paperwork(5, 5)');
        assert.strictEqual(paperwork(5,-5), 0, 'Failed at paperwork(5, -5)');
        assert.strictEqual(paperwork(-5,-5), 0, 'Failed at paperwork(-5, -5)');
        assert.strictEqual(paperwork(-5,5), 0, 'Failed at paperwork(-5, 5)');
        assert.strictEqual(paperwork(5,0), 0, 'Failed at paperwork(5, 0)');
    });
});
