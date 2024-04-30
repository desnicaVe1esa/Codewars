const Test = require('@codewars/test-compat');
const chromosomeCheck = require("./chromosomeCheck");
describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(chromosomeCheck('XY'), "Congratulations! You're going to have a son.")
        Test.assertEquals(chromosomeCheck('XX'), "Congratulations! You're going to have a daughter.")
    });
});