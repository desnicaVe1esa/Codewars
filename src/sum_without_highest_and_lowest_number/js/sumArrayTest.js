const {assert} = require("chai");
const sumArray = require("./sumArray");

it("example tests", ()=>{
    assert.strictEqual( sumArray(null)                     , 0 );
    assert.strictEqual( sumArray([ ])                      , 0 );
    assert.strictEqual( sumArray([ 3 ])                    , 0 );
    assert.strictEqual( sumArray([ 3, 5 ])                 , 0 );
    assert.strictEqual( sumArray([ 6, 2, 1, 8, 10 ])       , 16 );
    assert.strictEqual( sumArray([ 0, 1, 6, 10, 10 ])      , 17 );
    assert.strictEqual( sumArray([ -6, -20, -1, -10, -12 ]), -28 );
    assert.strictEqual( sumArray([ -6, 20, -1, 10, -12 ])  , 3 );
});