import factorial from "./factorial";

describe("Basic tests", () => {
    Test.assertEquals(factorial(0), 1);
    Test.assertEquals(factorial(1), 1);
    Test.assertEquals(factorial(4), 24);
    Test.assertEquals(factorial(7), 5040);
    Test.assertEquals(factorial(17), 355687428096000);
})