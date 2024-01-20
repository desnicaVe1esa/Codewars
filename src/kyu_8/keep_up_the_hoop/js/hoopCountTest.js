const Test = require('@codewars/test-compat');
const hoopCount = require("./hoopCount");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(hoopCount(3),"Keep at it until you get it" )
        Test.assertEquals(hoopCount(11),"Great, now move on to tricks" )
    });
});