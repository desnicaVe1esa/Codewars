test.describe("Santa's Sleigh")

sleigh = Sleigh()
def test_credentials(name, password, expected):
    test.assert_equals(sleigh.authenticate(name, password), expected, 'Tested name %s and password %s' % (name,password))

test.it('must authenticate with correct credentials')
test_credentials('Santa Claus', 'Ho Ho Ho!', True)

test.it('Must not authenticate with incorrect credentials')
test_credentials('Santa', 'Ho Ho Ho!', False)
test_credentials('Santa Claus', 'Ho Ho!', False)
test_credentials('jhoffner', 'CodeWars', False)