import findMissingNumber from "./findMissingNumber";

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(findMissingNumber("1 2 3 5"), 4, "It must work for missing middle terms")
        Test.assertEquals(findMissingNumber("1 3"), 2, "It must work for missing middle terms")
        Test.assertEquals(findMissingNumber("1 5"), 2, "It must work for missing more than one number")
        Test.assertEquals(findMissingNumber(""), 0, "It must return 0 for an empty sequence")
        Test.assertEquals(findMissingNumber("1 2 3 4 5"), 0, "It must return 0 if no number is missing")
        Test.assertEquals(findMissingNumber("2 3 4 5"), 1, "It must return 1 for a sequence missing the first element")
        Test.assertEquals(findMissingNumber("2 6 4 5 3"), 1, "It must work for a shuffled input")
        Test.assertEquals(findMissingNumber("2 1 4 3 a"), 1, "It must return 1 for an invalid sequence")
    });
});