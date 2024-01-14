const fromNb2Str = require("./fromNb2Str");
const assert = require('chai').assert;
describe("Tests", () => {
    it("n = 187, sys = [8,7,5,3]", () => {
        assert.strictEqual(fromNb2Str(187, [8,7,5,3]), "-3--5--2--1-");
    });
    it("n = 779, sys = [8, 7, 5, 3]", () => {
        assert.strictEqual(fromNb2Str(779, [8, 7, 5, 3]), "-3--2--4--2-");
    });
    it("n = 3450, sys = [13, 11, 7, 5, 3, 2]", () => {
        assert.strictEqual(fromNb2Str(3450, [13, 11, 7, 5, 3, 2]), "-5--7--6--0--0--0-");
    });
    it("Not pairwise coprime", () => {
        assert.strictEqual(fromNb2Str(15, [8, 6, 5, 3]), "Not applicable", "moduli 8 and 6 are not coprime");
    });
    it("n too big", () => {
        assert.strictEqual(fromNb2Str(3450, [17,5,3]), "Not applicable", "3450 is greater than product of moduli (255)");
    });
});