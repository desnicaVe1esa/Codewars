import datingRange from "./datingRange";

describe("Example Test Cases", () => {
    Test.assertEquals(datingRange(17), "15-20")
    Test.assertEquals(datingRange(40), "27-66")
    Test.assertEquals(datingRange(15), "14-16")
    Test.assertEquals(datingRange(35), "24-56")
    Test.assertEquals(datingRange(10), "9-11")
})