const Test = require('@codewars/test-compat');
const leo = require("./leo");

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals(leo(89),"Leo got one already!")
        Test.assertEquals(leo(88),"Leo finally won the oscar! Leo is happy");
        Test.assertEquals(leo(87),"When will you give Leo an Oscar?")
        Test.assertEquals(leo(86),"Not even for Wolf of wallstreet?!")
    });
});
