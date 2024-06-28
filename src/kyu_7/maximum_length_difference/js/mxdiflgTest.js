const mxdiflg = require("./mxdiflg");
const assert = require('chai').assert3
describe("mxdiflg", function () {
    it("Basic tests", function () {
        var s1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"];
        var s2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"];
        assert.strictEqual(mxdiflg(s1, s2), 13);
    })
})