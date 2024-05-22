const {assert} = require("chai");
const collinearity = require("./collinearity");

describe("Example tests", function() {
    it("collinear vectors", function() {
        assert.strictEqual( collinearity( 1,1, 1,1 ), true, `collinearity( 1,1, 1,1 )` );
        assert.strictEqual( collinearity( 1,2, 2,4 ), true, `collinearity( 1,2, 2,4 )` );
        assert.strictEqual( collinearity( 1,2, -1,-2 ), true, `collinearity( 1,2, -1,-2 )` );
    });
    it("non-collinear vectors", function() {
        assert.strictEqual( collinearity( 1,1, 6,1 ), false, `collinearity( 1,1, 6,1 )` );
        assert.strictEqual( collinearity( 1,2, 1,-2 ), false, `collinearity( 1,2, 1,-2 )` );
    });
    it("vectors containing zero", function() {
        assert.strictEqual( collinearity( 4,0, 11,0 ), true, `collinearity( 4,0, 11,0 )` );
        assert.strictEqual( collinearity( 0,1, 6,0 ), false, `collinearity( 0,1, 6,0 )` );
        assert.strictEqual( collinearity( 4,4, 0,4 ), false, `collinearity( 4,4, 0,4 )` );
    });
    it("zero vectors", function() {
        assert.strictEqual( collinearity( 0,0, 0,0 ), true, `collinearity( 0,0, 0,0 )` );
        assert.strictEqual( collinearity( 0,0, 1,0 ), true, `collinearity( 0,0, 1,0 )` );
        assert.strictEqual( collinearity( 5,7, 0,0 ), true, `collinearity( 5,7, 0,0 )` );
    });
});