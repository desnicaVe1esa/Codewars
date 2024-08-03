const Test = require('@codewars/test-compat');
const sort = require("./sort");

describe("Triple Sorting", function() {

  it("basic tests", function() {
    var students = [new Student(23, 88, "David Goodman"),
      new Student(25, 82, "Mark Rose"),
      new Student(22, 90, "Jane Doe"),
      new Student(25, 90, "Jane Dane")];
    Test.assertEquals(sort(students), "Jane Doe,Jane Dane,David Goodman,Mark Rose");
  });

});