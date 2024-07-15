import converter from "./converter";

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(converter(10), 3.54)
        Test.assertEquals(converter(20), 7.08)
        Test.assertEquals(converter(30), 10.62)
    });
});
