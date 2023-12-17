const Test = require('@codewars/test-compat');
const getAverage = require("./getAverage");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(getAverage([2,2,2,2]),2);
        Test.assertEquals(getAverage([1,2,3,4,5,]),3);
        Test.assertEquals(getAverage([1,1,1,1,1,1,1,2]),1);
    });
});
