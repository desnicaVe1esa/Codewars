const spoonerize = require("./spoonerize");
const assert = require("chai").assert

describe("Spoonerize Me", function() {
    it("Basic Tests", () => {
        assert.equal(spoonerize("nit picking"), "pit nicking");
        assert.equal(spoonerize("wedding bells"), "bedding wells");
        assert.equal(spoonerize("jelly beans"), "belly jeans");
    });
});