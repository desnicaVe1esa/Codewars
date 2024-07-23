@test.describe("Basic tests")
def fxd():
    @test.it('')
    def check():
        test.assert_equals(seats_in_theater(16,11,5,3) , 96)
        test.assert_equals(seats_in_theater(1,1,1,1) , 0)
        test.assert_equals(seats_in_theater(13,6,8,3) , 18)
        test.assert_equals(seats_in_theater(60,100,60,1) , 99)
        test.assert_equals(seats_in_theater(1000,1000,1000,1000) , 0)