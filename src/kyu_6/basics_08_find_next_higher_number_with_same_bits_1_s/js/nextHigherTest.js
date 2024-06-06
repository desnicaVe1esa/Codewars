import nextHigher from "./nextHigher";

describe('Testing nextHigher', () => {
  const {assert} = require('chai')

  const doTest = (n, expected) => {
    const actual = nextHigher(n)
    assert.strictEqual(actual, expected, `for nextHigher(${n})`)
  }

  it('Basic tests', () => {
    doTest(128, 256)
    doTest(1, 2)
    doTest(1022, 1279)
    doTest(127, 191)
    doTest(1253343, 1253359)
  })
})