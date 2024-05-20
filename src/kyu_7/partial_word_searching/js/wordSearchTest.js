import wordSearch from "./wordSearch";

describe("Tests", () => {
    it("test", () => {
        Test.assertSimilar(wordSearch("ab", ["za", "ab", "abc", "zab", "zbc"]), ["ab", "abc", "zab"])
        Test.assertSimilar(wordSearch("aB", ["za", "ab", "abc", "zab", "zbc"]), ["ab", "abc", "zab"])
        Test.assertSimilar(wordSearch("ab", ["za", "aB", "Abc", "zAB", "zbc"]), ["aB", "Abc", "zAB"])
        Test.assertSimilar(wordSearch("abcd", ["za", "aB", "Abc", "zAB", "zbc"]), ["Empty"])
    });
});
