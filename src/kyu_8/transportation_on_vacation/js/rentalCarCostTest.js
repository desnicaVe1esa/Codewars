const chai = require("chai");
const rentalCarCost = require("./rentalCarCost");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Regular Tests:", function() {
    it("Should work for under 3 days:", function() {
        assert.strictEqual(rentalCarCost(1), 40);
        assert.strictEqual(rentalCarCost(2), 80);
    });

    it("Should work for under 7 days:", function() {
        assert.strictEqual(rentalCarCost(3), 100);
        assert.strictEqual(rentalCarCost(4), 140);
        assert.strictEqual(rentalCarCost(5), 180);
        assert.strictEqual(rentalCarCost(6), 220);
    });

    it("Should work for 7 or more days:", function() {
        assert.strictEqual(rentalCarCost(7), 230);
        assert.strictEqual(rentalCarCost(8), 270);
        assert.strictEqual(rentalCarCost(9), 310);
        assert.strictEqual(rentalCarCost(10), 350);
    });
});