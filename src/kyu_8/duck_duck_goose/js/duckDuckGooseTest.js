const { assert } = require('chai');
const duckDuckGoose = require("./duckDuckGoose");

class Player {
    constructor(name) {
        this.name = name;
    }
}

let ex_names = ["a", "b", "c", "d", "c", "e", "f", "g", "h", "z"];
let players = ex_names.map((n) => new Player(n));

describe("fixed tests", function(){
    it("should find the correct goose", function(){
        assert.strictEqual(duckDuckGoose(players, 1),  "a");
        assert.strictEqual(duckDuckGoose(players, 3),  "c");
        assert.strictEqual(duckDuckGoose(players, 10), "z");
        assert.strictEqual(duckDuckGoose(players, 20), "z");
        assert.strictEqual(duckDuckGoose(players, 30), "z");
        assert.strictEqual(duckDuckGoose(players, 18), "g");
        assert.strictEqual(duckDuckGoose(players, 28), "g");
        assert.strictEqual(duckDuckGoose(players, 12), "b");
        assert.strictEqual(duckDuckGoose(players, 2),  "b");
        assert.strictEqual(duckDuckGoose(players, 7),  "f");
    });
});