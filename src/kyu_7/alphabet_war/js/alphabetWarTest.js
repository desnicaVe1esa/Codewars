const Test = require('@codewars/test-compat');
const alphabetWar = require("./alphabetWar");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals( alphabetWar("z") , "Right side wins!" );
        Test.assertEquals( alphabetWar("zdqmwpbs") , "Let's fight again!" );
        Test.assertEquals( alphabetWar("zzzzs"), "Right side wins!" );
        Test.assertEquals( alphabetWar("wwwwww"), "Left side wins!" );
    });
});