import isSolved from "./solution";

describe("Tests", () => {
    it("test", () => {
        Test.expect(isSolved([[0,0,1],
            [0,1,2],
            [2,1,0]]) === -1);
    });
});
