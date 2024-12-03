import codewars_test as test
from solution import validate_hello

@test.describe("Basic tests")
def test_group():
    @test.it("Should work for basic tests")
    def test_case():
        for inp, exp in [('hello',True), ('ciao bella!',True), ('salut',True),
                         ('hallo, salut',True), ('hombre! Hola!',True),
                         ('Hallo, wie geht\'s dir?',True), ('AHOJ!',True),
                         ('czesc',True), ('meh',False), ('Ahoj',True), ]:
            test.assert_equals(validate_hello(inp), exp, f"Testing for validate_hello({inp!r})")