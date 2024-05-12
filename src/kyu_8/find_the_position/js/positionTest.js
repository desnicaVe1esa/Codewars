import position from "./position";

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(position("a"),"Position of alphabet: 1");
        Test.assertEquals(position("z"),"Position of alphabet: 26");
        Test.assertEquals(position("e"),"Position of alphabet: 5");
    });
});
