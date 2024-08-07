import shark from "./solution";

describe("Example tests",() =>{
    Test.assertEquals(shark(12, 50, 4, 8, true), "Alive!");
    Test.assertEquals(shark(7, 55, 4, 16, true), "Alive!");
    Test.assertEquals(shark(24, 0, 4, 8, true), "Shark Bait!");
});