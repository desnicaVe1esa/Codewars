const chai = require("chai");
const assert = chai.assert;

describe("Example test cases", () => {
    [
        ["hey", "4433999"],
        ["one two three", "666 6633089666084477733 33"],
        ["Hello World!", "#44#33555 5556660#9#66677755531111"],
        ["Def Con 1!", "#3#33 3330#222#666 6601-1111"],
        ["A-z", "#2**#9999"],
        ["1984", "1-9-8-4-"],
        ["Big thanks for checking out my kata", "#22#444 4084426655777703336667770222443322255444664066688 806999055282"]
    ].forEach(([message, expected]) => {
        it(`Testing message: ${message}`, () => {
            assert.equal(sendMessage(message), expected);
        });
    });
});