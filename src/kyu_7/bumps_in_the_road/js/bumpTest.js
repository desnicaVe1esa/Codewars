const chai = require("chai");
const bump = require("./bump");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Bumps in the Road", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(bump("n"), "Woohoo!");
        assert.strictEqual(bump("__nn_nnnn__n_n___n____nn__nnn"), "Woohoo!");
        assert.strictEqual(bump("nnn_n__n_n___nnnnn___n__nnn__"), "Woohoo!");
        assert.strictEqual(bump("_nnnnnnn_n__n______nn__nn_nnn"), "Car Dead");
        assert.strictEqual(bump("______n___n_"), "Woohoo!");
    });
});