import {Block} from "./block";

describe("Tests", () => {
    it("test", () => {
        let block = new Block([2,4,6]);

        Test.assertEquals(block.getWidth(),  2)
        Test.assertEquals(block.getLength(), 4)
        Test.assertEquals(block.getHeight(), 6)
        Test.assertEquals(block.getVolume(), 48)
        Test.assertEquals(block.getSurfaceArea(), 88)

    });
});
