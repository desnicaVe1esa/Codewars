const Test = require('@codewars/test-compat');
const whoEatsWho = require("./whoEatsWho");

// actual/expected
describe("Example Tests", function() {

    it("example", function(){
        var input = "fox,bug,chicken,grass,sheep";
        var expected = 	[
            "fox,bug,chicken,grass,sheep",
            "chicken eats bug",
            "fox eats chicken",
            "sheep eats grass",
            "fox eats sheep",
            "fox"
        ];
        Test.assertSimilar(whoEatsWho(input), expected);
    });

});
