const Test = require('@codewars/test-compat');
const histogram = require("./histogram");

var show = function(h) {
    console.log(h)
    return h
}

// =====================================

describe("Example Tests", function(){

    it("basic", function(){
        var expected =
            "    10\n"+
            "    #\n"+
            "    #\n"+
            "7   #\n"+
            "#   #\n"+
            "#   #     5\n"+
            "#   #     #\n"+
            "# 3 #     #\n"+
            "# # #     #\n"+
            "# # # 1   #\n"+
            "# # # #   #\n"+
            "-----------\n"+
            "1 2 3 4 5 6\n";
        Test.assertEquals(show(histogram([7,3,10,1,0,5])), expected);
    });

});