import solve from "./solve";

describe("Basic tests", function () {
    Test.assertEquals(solve("code"), "code");
    Test.assertEquals(solve("CODe"), "CODE");
    Test.assertEquals(solve("COde"), "code");
    Test.assertEquals(solve("Code"), "code");
});