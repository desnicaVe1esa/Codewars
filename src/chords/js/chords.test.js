const Test = require('@codewars/test-compat');
const chords = require("./chords");

describe("Tests", () => {
    it("test", () => {
        Test.assertDeepEquals(chords("C"), [["C","E","G"],["C","D#","G"]]);
        Test.assertDeepEquals(chords("F"), [["F","A","C"],["F","G#","C"]]);
        Test.assertDeepEquals(chords("G"), [["G","B","D"],["G","A#","D"]]);
    });
});
