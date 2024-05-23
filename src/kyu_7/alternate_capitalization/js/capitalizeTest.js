import capitalize from "./capitalize";

describe("Basic tests", function () {
    Test.assertDeepEquals(capitalize("abcdef"), ['AbCdEf', 'aBcDeF']);
    Test.assertDeepEquals(capitalize("codewars"), ['CoDeWaRs', 'cOdEwArS']);
    Test.assertDeepEquals(capitalize("abracadabra"), ['AbRaCaDaBrA', 'aBrAcAdAbRa']);
    Test.assertDeepEquals(capitalize("codewarriors"), ['CoDeWaRrIoRs', 'cOdEwArRiOrS']);
});