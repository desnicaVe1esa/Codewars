const Test = require('@codewars/test-compat');
const logs = require("./logs");

describe("Example tests", function(){
    it("Example Test Case should pass basic tests", function(){
        Test.assertApproxEquals(logs(10, 2, 3), 0.7781512503836435);
        Test.assertApproxEquals(logs(5, 2, 3), 1.1132827525593785);
        Test.assertApproxEquals(logs(1000, 2, 3), 0.25938375012788123);
    });
});