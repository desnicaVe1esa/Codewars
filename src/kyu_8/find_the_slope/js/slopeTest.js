const Test = require('@codewars/test-compat');
const slope = require("./slope");

describe("Tests", () => {
  it("test", () => {
    Test.assertEquals( slope([19,3,20,3]), "0" );
    Test.assertEquals( slope([2,7,4,-7]), "-7" );
    Test.assertEquals( slope([10,50,30,150]), "5" );
    Test.assertEquals( slope([15,45,12,60]), "-5" );
    Test.assertEquals( slope([10,20,20,80]), "6" );
    Test.assertEquals( slope([-10,6,-10,3]), "undefined" );

  });
});
