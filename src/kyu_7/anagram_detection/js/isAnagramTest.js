const {assert} = require('chai');
const isAnagram = require("./isAnagram");

describe("Tests", () => {
    it("test", () => {
        assert.strictEqual(isAnagram("foefet", "toffee"), true, 'The word "foefet" is an anagram of "toffee"')
        assert.strictEqual(isAnagram("Buckethead", "DeathCubeK"), true, 'The word "Buckethead" is an anagram of "DeathCubeK"')
        assert.strictEqual(isAnagram("Twoo", "WooT"), true, 'The word "Twoo" is an anagram of "WooT"')

        assert.strictEqual(isAnagram("dumble", "bumble"), false, 'Characters do not match for test case "dumble", "bumble"')
        assert.strictEqual(isAnagram("ound", "round"), false, 'Missing characters for test case "ound", "round"')
        assert.strictEqual(isAnagram("apple", "pale"), false, 'Same letters, but different count')
    });
});