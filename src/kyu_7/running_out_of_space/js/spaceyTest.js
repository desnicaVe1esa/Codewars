const Test = require('@codewars/test-compat');
const spacey = require("./spacey");

describe("Tests", () => {
    it("test", () => {
        Test.assertDeepEquals(spacey(['kevin', 'has', 'no', 'space']), ['kevin', 'kevinhas', 'kevinhasno', 'kevinhasnospace']);
        Test.assertDeepEquals(spacey(['this', 'cheese', 'has', 'no', 'holes']), ['this', 'thischeese', 'thischeesehas', 'thischeesehasno', 'thischeesehasnoholes']);
    });
});
