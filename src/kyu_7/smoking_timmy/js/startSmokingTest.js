const Test = require('@codewars/test-compat');
const startSmoking = require("./startSmoking");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(startSmoking(0,1),22);
        Test.assertEquals(startSmoking(1,0),224);
        Test.assertEquals(startSmoking(1,1),247);
        Test.assertEquals(startSmoking(10,2),2294);
    });
});
