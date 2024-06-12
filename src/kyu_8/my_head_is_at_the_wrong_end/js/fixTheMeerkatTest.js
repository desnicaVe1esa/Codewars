const chai = require("chai");
const fixTheMeerkat = require("./fixTheMeerkat");
const assert = chai.assert;
chai.config.truncateThreshold = 0;
describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.deepEqual(fixTheMeerkat(["tail", "body", "head"]), ["head", "body", "tail"]);
        assert.deepEqual(fixTheMeerkat(["tails", "body", "heads"]), ["heads", "body", "tails"]);
        assert.deepEqual(fixTheMeerkat(["bottom", "middle", "top"]), ["top", "middle", "bottom"]);
        assert.deepEqual(fixTheMeerkat(["lower legs", "torso", "upper legs"]), ["upper legs", "torso", "lower legs"]);
        assert.deepEqual(fixTheMeerkat(["ground", "rainbow", "sky"]), ["sky", "rainbow", "ground"]);
    })
})
