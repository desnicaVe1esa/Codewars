const {assert} = require('chai');
const sayHello = require("./sayHello");

describe("Tests", () => {
    it("test", () => {
        assert.strictEqual(sayHello('Mr. Spock'), 'Hello, Mr. Spock')
        assert.strictEqual(sayHello('Captain Kirk'), 'Hello, Captain Kirk')
        assert.strictEqual(sayHello('Liutenant Uhura'), 'Hello, Liutenant Uhura')
        assert.strictEqual(sayHello('Dr. McCoy'), 'Hello, Dr. McCoy')
    });
});
