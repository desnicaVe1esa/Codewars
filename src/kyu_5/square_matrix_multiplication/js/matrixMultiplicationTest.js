const Test = require('@codewars/test-compat');
const matrixMultiplication = require("./matrixMultiplication");


describe("Tests", () => {
    it("test", () => {
        Test.assertSimilar(matrixMultiplication([[1, 2], [3, 2]], [[3, 2], [1, 1]]), [[5, 4], [11, 8]]);
    });
});
