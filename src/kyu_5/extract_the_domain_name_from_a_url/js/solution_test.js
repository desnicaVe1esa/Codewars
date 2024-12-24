const { assert } = require("chai");
const domainName = require("./solution");

describe("Sample test", () => {
    it("Should pass sample tests", () => {
        assert.equal(domainName("http://google.com"), "google");
        assert.equal(domainName("http://google.co.jp"), "google");
        assert.equal(domainName("www.xakep.ru"), "xakep");
        assert.equal(domainName("https://youtube.com"), "youtube");
    })
})
