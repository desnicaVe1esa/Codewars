describe('hex number', () => {
    it('Basic tests', () => {
        Test.assertEquals(''.digit(), false);
        Test.assertEquals('7'.digit(), true);
        Test.assertEquals(' '.digit(), false);
        Test.assertEquals('a'.digit(), false);
        Test.assertEquals('a5'.digit(), false);
        Test.assertEquals('14'.digit(), false);
    });
});