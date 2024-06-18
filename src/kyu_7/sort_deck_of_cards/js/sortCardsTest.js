const Test = require('@codewars/test-compat');
const sortCards = require("./sortCards");

describe("Tests", () => {
    it("test", () => {
        Test.assertSimilar(sortCards([3,9,"A",5,"T",8,2,4,"Q",7,"J",6,"K"]),(["A",2,3,4,5,6,7,8,9,"T","J","Q","K"]));
        Test.assertSimilar(sortCards(["J","J",2,"T",9,6]),([2,6,9,"T","J","J"]));
        Test.assertSimilar(sortCards(["A",2,3,4,5,6,6,7,8,9,"T","J","Q","A"]),(['A', 'A', 2, 3, 4, 5, 6, 6, 7, 8, 9, 'T', 'J', 'Q']));
    });
});
