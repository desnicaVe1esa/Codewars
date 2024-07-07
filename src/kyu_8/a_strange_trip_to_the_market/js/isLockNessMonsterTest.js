const Test = require('@codewars/test-compat');
const isLockNessMonster = require("./isLockNessMonster");

describe("Tests", () => {
    it("test", () => {
        console.log("Your girlscout cookies are ready to ship. Your total comes to tree fiddy");
        Test.expect(isLockNessMonster("Your girlscout cookies are ready to ship. Your total comes to tree fiddy"));
        console.log("Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance.");
        Test.expect(!isLockNessMonster("Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance."));
    });
});
