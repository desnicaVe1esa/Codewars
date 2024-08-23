const Test = require('@codewars/test-compat');
const NameMe = require("./NameMe");

describe("Tests", () => {
    it("test", () => {
        var n = new NameMe('John', 'Doe');
        Test.expect((typeof n.firstName != undefined && n.firstName == "John"), "Verifying First name. Object returned should contain the firstname: John");
        Test.expect((typeof n.lastName != undefined && n.lastName == "Doe"), "Verifying Last name. Object returned should contain the lastname: Doe");
        Test.expect((typeof n.name != undefined && n.name == "John Doe"), "Verifying full name. Object returned should contain the full name: John Doe");
    });
});
