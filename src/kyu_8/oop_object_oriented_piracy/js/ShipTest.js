const Ship = require("./Ship");
const assert = require('chai').assert;

describe('Captain, we see some ships!', () => {
    it("Empty ship (draft: 0, crew: 0)", () => {
        let emptyShip = new Ship(0,0);
        assert.isFalse(emptyShip.isWorthIt());
    });
    it("A worth ship (draft: 100, crew: 20)", () => {
        let aWorthyShip = new Ship(100,20);
        assert.isTrue(aWorthyShip.isWorthIt());
    });
});