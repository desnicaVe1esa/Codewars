from solution import data_reverse
import codewars_test as test

@test.describe("Testing...")
def _():

    @test.it("fixed tests")
    def _():
        data1 = [1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0]
        data2 = [1,0,1,0,1,0,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1]
        test.assert_equals(data_reverse(data1),data2)

        data3 = [0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1]
        data4 = [0,0,1,0,1,0,0,1,0,0,1,1,0,1,1,0]
        test.assert_equals(data_reverse(data3),data4)
