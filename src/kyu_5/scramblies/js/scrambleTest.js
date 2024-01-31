const chai = require("chai");
const scramble = require("./scramble");
const assert = chai.assert;
chai.config.truncateThreshold = 0;

describe('Sample Tests', function(){
    it("Tests", () => {
        assert.strictEqual(scramble('rkqodlw',           'world'      ), true );
        assert.strictEqual(scramble('cedewaraaossoqqyt', 'codewars'   ), true );
        assert.strictEqual(scramble('katas',             'steak'      ), false);
        assert.strictEqual(scramble('scriptjavx',        'javascript' ), false);
        assert.strictEqual(scramble('scriptingjava',     'javascript' ), true );
        assert.strictEqual(scramble('scriptsjava',       'javascripts'), true );
        assert.strictEqual(scramble('javscripts',        'javascript' ), false);
        assert.strictEqual(scramble('jscripts',          'javascript' ), false);
        assert.strictEqual(scramble('aabbcamaomsccdd',   'commas'     ), true );
        assert.strictEqual(scramble('commas',            'commas'     ), true );
        assert.strictEqual(scramble('sammoc',            'commas'     ), true )
    });

    it("Large inputs test", () => {
        let s1 = "abcdefghijklmnopqrstuvwxyz".repeat(10_000);
        let s2 = "zyxcba".repeat(9_000);
        assert.strictEqual(scramble(s1, s2), true);
    });
});