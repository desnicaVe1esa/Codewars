const rank = require("./rank");
const assert = require('chai').assert


describe("Rank",function() {
    it("Basic tests",function() {
        assert.strictEqual(rank("Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin", [4, 2, 1, 4, 3, 1, 2], 4), "Benjamin")
        assert.strictEqual(rank("Lagon,Lily", [1, 5], 2), "Lagon")
        assert.strictEqual(rank("Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin", [4, 2, 1, 4, 3, 1, 2], 8), "Not enough participants")
        assert.strictEqual(rank("", [4, 2, 1, 4, 3, 1, 2], 6), "No participants")
    })})