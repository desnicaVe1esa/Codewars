const Test = require('@codewars/test-compat');
const getPlanetName = require("./getPlanetName");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(getPlanetName(2), 'Venus');
        Test.assertEquals(getPlanetName(5), 'Jupiter');
        Test.assertEquals(getPlanetName(3), 'Earth');
    });
});
