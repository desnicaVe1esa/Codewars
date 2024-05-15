const {assert} = require("chai");
const score = require("./score");

describe( "Scorer Function", function() {
    it( "should value this as worthless", function() {
        assert.strictEqual( score( [2, 3, 4, 6, 2] ), 0, "Incorrect answer for dice = [2, 3, 4, 6, 2]" );
    });

    it( "should value this triplet correctly", function() {
        assert.strictEqual( score( [4, 4, 4, 3, 3] ), 400, "Incorrect answer for dice = [4, 4, 4, 3, 3]" );
    });

    it( "should value this mixed set correctly", function() {
        assert.strictEqual( score( [2, 4, 4, 5, 4] ), 450, "Incorrect answer for dice = [2, 4, 4, 5, 4]" );
    });
});