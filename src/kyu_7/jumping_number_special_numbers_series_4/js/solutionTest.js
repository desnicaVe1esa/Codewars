import jumpingNumber from "./solution";

describe("Basic tests",() =>{
    Test.assertEquals(jumpingNumber(1), "Jumping!!");
    Test.assertEquals(jumpingNumber(7), "Jumping!!");
    Test.assertEquals(jumpingNumber(9), "Jumping!!");
    Test.assertEquals(jumpingNumber(23), "Jumping!!");
    Test.assertEquals(jumpingNumber(32), "Jumping!!");
    Test.assertEquals(jumpingNumber(79), "Not!!");
    Test.assertEquals(jumpingNumber(98), "Jumping!!");
    Test.assertEquals(jumpingNumber(8987), "Jumping!!");
    Test.assertEquals(jumpingNumber(4343456), "Jumping!!");
    Test.assertEquals(jumpingNumber(98789876), "Jumping!!");
});