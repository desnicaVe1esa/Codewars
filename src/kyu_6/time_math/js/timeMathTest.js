const chai = require("chai");
const timeMath = require("./timeMath");
const assert = chai.assert;
chai.config.truncateThreshold = 0;

describe("Sample Tests", () => {
  it("Add", () => {
    assert.strictEqual(timeMath('01:24:31', '+', '02:16:05'), '03:40:36');
    assert.strictEqual(timeMath('01:24:31', '+', '22:35:28'), '23:59:59');
  });

  it("Subtract", () => {
    assert.strictEqual(timeMath('11:24:31', '-', '11:24:31'), '00:00:00');
    assert.strictEqual(timeMath('11:24:31', '-', '03:15:28'), '08:09:03');
  });

  it('Carry +', () => {
    assert.strictEqual(timeMath('00:00:01', '+', '23:59:59'), '00:00:00');
    assert.strictEqual(timeMath('13:48:52', '+', '13:47:53'), '03:36:45');
  });

  it('Carry -', () => {
    assert.strictEqual(timeMath('00:00:01', '-', '00:00:02'), '23:59:59');
    assert.strictEqual(timeMath('13:48:52', '-', '13:47:53'), '00:00:59');
  });
})
