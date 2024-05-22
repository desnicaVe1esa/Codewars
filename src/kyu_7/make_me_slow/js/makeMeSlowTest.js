const { expect } = require('chai')
const makeMeSlow = require("./makeMeSlow");

describe('Execution Speed Test', () => {
    it('Should Take >= 7000ms', () => {
        const start = new Date().getTime()
        makeMeSlow()
        const duration = new Date().getTime() - start

        expect(duration).to.be.at.least(7000, 'Function finished in too few milliseconds');
    })
})