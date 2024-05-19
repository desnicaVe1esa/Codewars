const stockList = require("./stockList");
const assert = require('chai').assert
describe("Tests", () => {
    it("test", () => {
        let b,c,res
        b = ["BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600"]
        c = ["A", "B", "C", "D"]
        res = "(A : 0) - (B : 1290) - (C : 515) - (D : 600)"
        assert.strictEqual(stockList(b, c), res)

        b = ["ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"]
        c = ["A", "B"]
        res = "(A : 200) - (B : 1140)"
        assert.strictEqual(stockList(b, c), res)
    });
});
