const chai = require('chai');
const evenOr0dd = require("./evenOr0dd");
const assert = chai.assert;

describe("Sample tests",() => {

    it("2 is even", () => {
        assert.strictEqual(evenOr0dd(2), "Even");
    });
    it("7 is odd", () => {
        assert.strictEqual(evenOr0dd(7), "Odd");
    });
    it("-42 is even", () => {
        assert.strictEqual(evenOr0dd(-42), "Even");
    });
    it("-7 is odd", () => {
        assert.strictEqual(evenOr0dd(-7), "Odd");
    });
    it("0 is even", () => {
        assert.strictEqual(evenOr0dd(0), "Even");
    });
});
