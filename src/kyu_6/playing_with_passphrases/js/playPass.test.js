const Test = require('@codewars/test-compat');
const playPass = require("./playPass");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(playPass("I LOVE YOU!!!", 1), "!!!vPz fWpM J")

        Test.assertEquals(playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2),
            "4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO")

    });
});