const Test = require('@codewars/test-compat');
const swapValues = require("./swapValues");

describe("Tests", () => {
    it("test", () => {
        let arr = [1, 2]
        swapValues(arr);
        Test.assertEquals(arr[0], 2, "Failed swapping numbers")
        Test.assertEquals(arr[1], 1, "Failed swapping numbers")

    });
});