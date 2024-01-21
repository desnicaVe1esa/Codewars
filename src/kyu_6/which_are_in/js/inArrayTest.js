const { assert, config } = require('chai');
const inArray = require("./inArray");
config.truncateThreshold = 0;

describe("Tests", () => {
    it("test", () => {

        a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

        a1 = ["xyz", "live", "strong"]
        assert.sameOrderedMembers(inArray(a1, a2), ["live", "strong"])

        a1 = ["live", "strong", "arp"]
        assert.sameOrderedMembers(inArray(a1, a2), ["arp", "live", "strong"])

        a1 = ["tarp", "mice", "bull"]
        assert.sameOrderedMembers(inArray(a1, a2), [])
    });
});