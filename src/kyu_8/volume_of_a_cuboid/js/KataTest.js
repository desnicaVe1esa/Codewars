const { assert } = require('chai')
const Kata = require("./Kata");

describe("Tests", () => {
    it("Example tests", () => {
        assert.strictEqual(Kata.getVolumeOfCuboid(1,2,2),  4);
        assert.strictEqual(Kata.getVolumeOfCuboid(6,2,5), 60);
    });
});
