1
const { assert } = require('chai');3
const doTest = (num, expected) => {  const actual = dashatize(num);  assert.strictEqual(actual, expected, `Testing for num = ${num}`);};8
describe('Dashatize it', () => {  describe('Sample Tests', () => {    it('Basic', () => {      doTest(274, "2-7-4");      doTest(5311, "5-3-1-1");      doTest(86320, "86-3-20");      doTest(974302, "9-7-4-3-02");    });17
    it('Weird', () => {    });  });});25