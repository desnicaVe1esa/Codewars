const {assert,config} = require('chai')
const partlist = require("./solution");
config.truncateThreshold = 0

function testing(actual, expected) {
    assert.deepEqual(actual, expected);
}

describe("partlist",function() {
    it("1st Basic tests", function() {
        testing(partlist(["I", "wish", "I", "hadn't", "come"]),
            [["I", "wish I hadn't come"], ["I wish", "I hadn't come"], ["I wish I", "hadn't come"], ["I wish I hadn't", "come"]])
        testing(partlist(["cdIw", "tzIy", "xDu", "rThG"]),
            [["cdIw", "tzIy xDu rThG"], ["cdIw tzIy", "xDu rThG"], ["cdIw tzIy xDu", "rThG"]])
        testing(partlist(["vJQ", "anj", "mQDq", "sOZ"]),
            [["vJQ", "anj mQDq sOZ"], ["vJQ anj", "mQDq sOZ"], ["vJQ anj mQDq", "sOZ"]])
    })
})