from solution import street_fighter_selection
import codewars_test as test

fighters = [
    ["Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"],
    ["Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"]
]
opts = ["up","down","right","left"]


@test.describe("Fixed tests")
def _():
    @test.it("should work with no selection cursor moves")
    def _():
        moves =  []
        solution = []
        test.assert_equals(street_fighter_selection(fighters,(0,0), moves), solution)

    @test.it("should go left 8 times")
    def _():
        moves =  ["left"]*8
        solution = ['Vega', 'Balrog', 'Guile', 'Blanka', 'E.Honda', 'Ryu', 'Vega', 'Balrog']
        test.assert_equals(street_fighter_selection(fighters,(0,0), moves), solution)

    @test.it("should go right 8 times")
    def _():
        moves =  ["right"]*8
        solution = ['E.Honda', 'Blanka', 'Guile', 'Balrog', 'Vega', 'Ryu', 'E.Honda', 'Blanka']
        test.assert_equals(street_fighter_selection(fighters,(0,0), moves), solution)

    @test.it("should go up 4 times, always the same")
    def _():
        moves =  ["up"]*4
        solution = ['Ryu', 'Ryu', 'Ryu', 'Ryu']
        test.assert_equals(street_fighter_selection(fighters,(0,0), moves), solution)

    @test.it("should go down 4 times, always the same")
    def _():
        moves =  ["down"]*4
        solution = ['Ken', 'Ken', 'Ken', 'Ken']
        test.assert_equals(street_fighter_selection(fighters,(0,0), moves), solution)

    @test.it("should use all 4 directions counter-clockwise twice")
    def _():
        moves =  ["down","right","up","left"]*2
        solution = ['Ken', 'Chun Li', 'E.Honda', 'Ryu', 'Ken', 'Chun Li', 'E.Honda', 'Ryu']
        test.assert_equals(street_fighter_selection(fighters,(0,0), moves), solution)

    @test.it("should use all 4 directions clockwise twice")
    def _():
        moves =  ["up","left","down","right"]*2
        solution = ['Ryu', 'Vega', 'M.Bison', 'Ken', 'Ryu', 'Vega', 'M.Bison', 'Ken']
        test.assert_equals(street_fighter_selection(fighters,(0,0), moves), solution)
