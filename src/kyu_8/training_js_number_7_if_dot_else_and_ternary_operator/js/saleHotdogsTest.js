const {assert} = require('chai');
const saleHotdogs = require("./saleHotdogs");

describe("Tests", () => {
    it("Sample tests", () => {
        assert.strictEqual(saleHotdogs(1), 100);
        assert.strictEqual(saleHotdogs(4), 400);
        assert.strictEqual(saleHotdogs(5), 475);
        assert.strictEqual(saleHotdogs(9), 855);
        assert.strictEqual(saleHotdogs(10), 900);
        assert.strictEqual(saleHotdogs(100), 9000);
    });
});
