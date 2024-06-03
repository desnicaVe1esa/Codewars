const { assert } = require('chai');

it("Basic tests",() =>{
    assert.strictEqual("test case".camelCase(), "TestCase");
    assert.strictEqual("camel Case method".camelCase(), "CamelCaseMethod");
    assert.strictEqual("say hello".camelCase(), "SayHello");
    assert.strictEqual("camel case word".camelCase(), "CamelCaseWord");
    assert.strictEqual("".camelCase(), "");
})