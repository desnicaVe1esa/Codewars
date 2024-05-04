const chai = require("chai")
const solution = require("./solution");
const assert = chai.assert
chai.config.truncateThreshold = 0

describe("Fixed test cases", function() {
    it("True test in description", function() {
        assert.strictEqual(solution(["excavate", "endure", "desire", "screen", "theater", "excess", "night"]), true)
    })
    it("False test in description", function() {
        assert.strictEqual(solution(["trade", "pole", "view", "grave", "ladder", "mushroom", "president"]), false)
    })
    it("Five words", function() {
        assert.strictEqual(solution(["screen", "desire", "theater", "excess", "night"]), true)
    })
    it("Four words", function() {
        assert.strictEqual(solution(["engine", "endure", "elite", "excess"]), true)
    })
    it("One letter words", function() {
        assert.strictEqual(solution(["east", "e", "e", "t", "t", "e", "time"]), true)
    })
    it("One more test", function() {
        assert.strictEqual(solution(["no", "dog", "on", "good"]), false)
    })
})