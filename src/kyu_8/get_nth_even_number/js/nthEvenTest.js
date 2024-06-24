1
const chai = require('chai');const assert = chai.assert;4
describe("Sample tests", () => {  it("Taken from the description", () => {    assert.strictEqual(nthEven(1), 0, "Wrong Value!");    assert.strictEqual(nthEven(2), 2, "Wrong Value!");    assert.strictEqual(nthEven(3), 4, "Wrong Value!");10
    assert.strictEqual(nthEven(100), 198, "Wrong Value!");    assert.strictEqual(nthEven(1298734), 2597466, "Wrong Value!");  });});
14