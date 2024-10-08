const chai = require("chai");
const whatCentury = require("./whatCentury");
const assert = chai.assert;

describe("Tests", () => {
    it("test", () => {
        assert.strictEqual(whatCentury("1999"), "20th", "With input '1999' solution produced wrong output");
        assert.strictEqual(whatCentury("2011"), "21st", "With input '2011' solution produced wrong output");
        assert.strictEqual(whatCentury("2154"), "22nd", "With input '2154' solution produced wrong output");
        assert.strictEqual(whatCentury("2259"), "23rd", "With input '2259' solution produced wrong output");
        assert.strictEqual(whatCentury("1234"), "13th", "With input '1234' solution produced wrong output");
        assert.strictEqual(whatCentury("1023"), "11th", "With input '1023' solution produced wrong output");
        assert.strictEqual(whatCentury("2000"), "20th", "With input '2000' solution produced wrong output");
    });
});
