const { assert } = require('chai');
const _if = require("./_if");

describe("Tests", () => {

  const unexpectedTrue  = () => assert.fail("'true' function unexpectedly called");
  const unexpectedFalse = () => assert.fail("'false' function unexpectedly called");


  it("test true function", () => {
    let testvar = 0;
    _if(true,  () => testvar = 42,   unexpectedFalse);
    assert.strictEqual(testvar, 42, "'true' function has not been called");
  });
  it("test false function", () => {
    let testvar = 0;
    _if(false, unexpectedTrue, () => testvar=42);
    assert.strictEqual(testvar, 42, "'false' function has not been called");
  });
});
