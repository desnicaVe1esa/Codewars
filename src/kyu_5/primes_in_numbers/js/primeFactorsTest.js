import primeFactors from "./primeFactors";

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(primeFactors(7775460), "(2**2)(3**3)(5)(7)(11**2)(17)")
    });
});
