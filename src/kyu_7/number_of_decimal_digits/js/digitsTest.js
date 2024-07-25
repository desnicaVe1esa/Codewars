1
const {assert} = require('chai');3
describe('Sample Tests', function() {  const tests = [    [0, 1],    [9, 1],    [66, 2],    [12345, 5],    [128685, 6],    [9876543210, 10],    [9007199254740991, 16],  ];14
  for (let [n, expected] of tests) {    it(`${n}`, function() {      assert.strictEqual(digits(n), expected);    });