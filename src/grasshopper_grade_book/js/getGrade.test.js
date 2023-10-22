const Test = require('@codewars/test-compat');
const getGrade = require("./getGrade");

describe('grade book', function () {
    it('should return an A', function () {
        Test.assertEquals(getGrade(95,90,93), 'A')
        Test.assertEquals(getGrade(100,85,96), 'A')
        Test.assertEquals(getGrade(92,93,94), 'A')
    })
    it('should return a B', function () {
        Test.assertEquals(getGrade(70,70,100), 'B')
        Test.assertEquals(getGrade(82,85,87), 'B')
        Test.assertEquals(getGrade(84,79,85), 'B')
        Test.assertEquals(getGrade(89,89,90), 'B')
    })
    it('should return a C', function () {
        Test.assertEquals(getGrade(70,70,70), 'C')
        Test.assertEquals(getGrade(75,70,79), 'C')
        Test.assertEquals(getGrade(60,82,76), 'C')
    })
    it('should return a D', function () {
        Test.assertEquals(getGrade(65,70,59), 'D')
        Test.assertEquals(getGrade(66,62,68), 'D')
        Test.assertEquals(getGrade(58,62,70), 'D')
    })
    it('should return an F', function () {
        Test.assertEquals(getGrade(44,55,52), 'F')
        Test.assertEquals(getGrade(48,55,52), 'F')
        Test.assertEquals(getGrade(58,59,60), 'F')
    })
})