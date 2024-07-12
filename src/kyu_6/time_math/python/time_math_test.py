import codewars_test as test
from solution import time_math

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it("Add")
    def test_case():
        test.assert_equals(time_math('01:24:31', '+', '02:16:05'), '03:40:36')
        test.assert_equals(time_math('01:24:31', '+', '22:35:28'), '23:59:59')

    @test.it("Subtract")
    def test_case():
        test.assert_equals(time_math('11:24:31', '-', '11:24:31'), '00:00:00')
        test.assert_equals(time_math('11:24:31', '-', '03:15:28'), '08:09:03')

    @test.it('Carry +')
    def test_case():
        test.assert_equals(time_math('00:00:01', '+', '23:59:59'), '00:00:00')
        test.assert_equals(time_math('13:48:52', '+', '13:47:53'), '03:36:45')

    @test.it('Carry -')
    def test_case():
        test.assert_equals(time_math('00:00:01', '-', '00:00:02'), '23:59:59')
        test.assert_equals(time_math('13:48:52', '-', '13:47:53'), '00:00:59')