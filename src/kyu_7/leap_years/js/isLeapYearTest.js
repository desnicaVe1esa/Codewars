const { assert } = require('chai');
const isLeapYear = require("./isLeapYear");

describe("Example tests", () => {

  it("Year 2020 is a leap year", () => {
    assert.strictEqual(isLeapYear(2020), true, "Incorrect answer for year = 2020");
  });

  it("Year 2000 is a leap year", () => {
    assert.strictEqual(isLeapYear(2000), true, "Incorrect answer for year = 2000");
  });

  it("Year 2015 is not a leap year", () => {
    assert.strictEqual(isLeapYear(2015), false, "Incorrect answer for year = 2015");
  });

  it("Year 2100 is not a leap year", () => {
    assert.strictEqual(isLeapYear(2100), false, "Incorrect answer for year = 2100");
  });
});