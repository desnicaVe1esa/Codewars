const { assert } = require('chai');
const {Dictionary} = require("./index");

describe("Sample tests", () => {
    let d = new Dictionary();

    it("Testing for key 'Apple', should equal 'A fruit'", () => {
        d.newEntry('Apple', 'A fruit');
        assert.strictEqual(d.look('Apple'), 'A fruit');
    });

    it("Testing for key 'Soccer', should equal 'A sport'", () => {
        d.newEntry('Soccer', 'A sport');
        assert.strictEqual(d.look('Soccer'), 'A sport');
    });

    it("Testing for non-existing keys", () => {
        assert.strictEqual(d.look('Hi'), 'Can\'t find entry for Hi');
        assert.strictEqual(d.look('Ball'), 'Can\'t find entry for Ball');
    });

    it("Testing that entries are case sensitive", () => {
        assert.strictEqual(d.look('soccer'), 'Can\'t find entry for soccer');
        d.newEntry('soccer', 'a sport');
        assert.strictEqual(d.look('soccer'), 'a sport');
    });
});