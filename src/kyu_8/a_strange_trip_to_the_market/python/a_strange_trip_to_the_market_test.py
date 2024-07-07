import codewars_test as test
from solution import is_loch_ness_monster

tests = [
    ("Your girlscout cookies are ready to ship. Your total comes to tree fiddy", True),
    ("Howdy Pardner. Name's Pete Lexington. I reckon you're the kinda stiff who carries about tree fiddy?", True),
    ("I'm from Scottland. I moved here to be with my family sir. Please, $3.50 would go a long way to help me find them", True),
    ("Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance.", False),
    ("I will absolutely, positively, never give that darn Loch Ness Monster any of my three dollars and fifty cents", False),
    ("Did I ever tell you about my run with that paleolithic beast? He tried all sorts of ways to get at my three dolla and fitty cent? I told him 'this is MY 4 dolla!'. He just wouldn't listen.", False),
    ("Hello, I come from the year 3150 to bring you good news!", False),
    ("By 'tree fiddy' I mean 'three fifty'", True),
    ("I will be at the office by 3:50 or maybe a bit earlier, but definitely not before 3, to discuss with 50 clients", False),
    ("", False)
]
for string, expected in tests:
    @test.it(f"{string!r}")
    def _test():
        test.assert_equals(is_loch_ness_monster(string), expected)