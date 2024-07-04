const {assert} = require('chai')
const sortGiftCode = require("./sortGiftCode");
describe('sortGiftCode', () => {
    it('Fixed tests', () => {
        assert.strictEqual(sortGiftCode('abcdef'), 'abcdef', "sortGiftCode('abcdef')")
        assert.strictEqual(sortGiftCode('pqksuvy'), 'kpqsuvy', "sortGiftCode('pqksuvy')")
        assert.strictEqual(sortGiftCode('zyxwvutsrqponmlkjihgfedcba'), 'abcdefghijklmnopqrstuvwxyz', "sortGiftCode('zyxwvutsrqponmlkjihgfedcba')")
    })
})