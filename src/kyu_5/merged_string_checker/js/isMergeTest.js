const isMerge = require("./isMerge");
const strictEqual = require('chai').assert.strictEqual;

function doTest (expected, s, part1, part2) {
    const actual = isMerge(s, part1, part2);
    const log = `for s = "${s}"\npart1 = "${part1}"\npart2 = "${part2}"\n`;
    strictEqual(actual, expected, log);
}

describe("isMerge", function() {
    it('can handle som basic cases', function() {
        doTest(true, 'xcyc', 'xc', 'yc');
        doTest(true, 'xcyc', 'yc', 'xc');
        doTest(true, 'xcyc', 'xc', 'cy');
        doTest(true, 'xcyc', 'cy', 'xc');

        doTest(true, 'codewars', 'code', 'wars');
        doTest(true, 'codewars', 'cdwr', 'oeas');
        doTest(true, 'Making progress', 'Mak pross', 'inggre');
        doTest(false, 'codewars', 'code', 'code');
        doTest(false, 'More progress', 'More ess', 'pro');
    });
});