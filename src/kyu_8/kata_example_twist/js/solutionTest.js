const Test = require('@codewars/test-compat');

describe("Tests", () => {
    it("test", () => {
        Test.expect(websites.length > 0, 'The array is still empty')
        Test.expect(websites.length === 1000, 'The array does not equal 1,000')
        Test.expect(websites.every(function(e){return e === 'codewars';}), 'Every element in the array must contain the value "codewars"');
    });
});
