const chai = require("chai");
const vaporcode = require("./vaprocode");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("V  A  P  O  R  C  O  D  E", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(vaporcode("Lets go to the movies"),"L  E  T  S  G  O  T  O  T  H  E  M  O  V  I  E  S");
        assert.strictEqual(vaporcode("Why isnt my code working"),"W  H  Y  I  S  N  T  M  Y  C  O  D  E  W  O  R  K  I  N  G");
    });

});
