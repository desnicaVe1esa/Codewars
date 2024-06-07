import parse from "./parse";

describe("Tests", () => {
    it("test", () => {
        Test.assertDeepEquals(parse("iiisdoso"), [8, 64]);
        Test.assertDeepEquals(parse("iiisxxxdoso"), [8, 64]);
    });
});
