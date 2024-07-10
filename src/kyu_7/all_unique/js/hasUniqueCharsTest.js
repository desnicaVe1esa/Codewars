import hasUniqueChars from "./hasUniqueChars";

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(hasUniqueChars("  nAa"),false) // because there are two spaces ' '
        Test.assertEquals(hasUniqueChars("abcdef"),true)
        Test.assertEquals(hasUniqueChars("aA"),true) // case - sensitivity
        Test.assertEquals(hasUniqueChars("++-"),false) // because there are two '+'

    });
});
