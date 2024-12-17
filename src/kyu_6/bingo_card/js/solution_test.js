const Test = require('@codewars/test-compat');


describe("Bingo Card:", function () {

    it("Has 24 numbers", function () {
        Test.assertEquals(getCard().length, 24);
    });

    it("Each number is unique", function () {

        var card = getCard();

        var areAllUnique = true;
        for (i = 0; i < card.length; i++) {
            for (j = 0; j < card.length; j++) {
                if (areAllUnique && i != j && card[i] == card[j]) {
                    areAllUnique = false;
                }
            }
        }
        Test.assertEquals(areAllUnique,true);
    });

    it("Contains a column B that has 5 items", function () {
        testColumnCount(5, 'B');
    });

    it("Contains a column I that has 5 items", function () {
        testColumnCount(5, 'I');
    });

    it("Contains a column N that has 4 items", function () {
        testColumnCount(4, 'N');
    });

    it("Contains a column G that has 5 items", function () {
        testColumnCount(5, 'G');
    });

    it("Contains a column O that has 5 items", function () {
        testColumnCount(5, 'O');
    });

    if ("Is ordered by column", function () {
        var card = getCard();
        var columns = '';
        for (i = 0; i < card.length; i++) {
            columns += card[i].substring(0, 1);
        }
        Test.assertEquals(Regexp.IsMatch(columns, "^[B]*[I]*[N]*[G]*[O]*$"),true);
    });

    it("Numbers within a column are in random order", function () {
        var card = getCard();

        var bigger = 0;
        var n0 = Number(card[0].substring(1, card[0].length));

        for (i = 1; i < card.length; i++)
        {
            var n1 = Number(card[i].substring(1, card[i].length))
            if (n0 > n1)
            {
                bigger++;
            }
            n0 = n1;
        }

        Test.assertEquals(bigger > 6, true, "Unlikely variation, found only " + bigger.toString() + " times out of 24 that the next number was bigger than the previous number.");
        Test.assertEquals(bigger < 23, true, "Unlikely variation, found " + bigger.toString() + " times out of 24 that the next number was bigger than the previous number.");
    });

    it("Numbers in column B are all in range 1-15", function () {
        testColumnRange('B', 1, 15);
    });

    it("Numbers in column I are all in range 16-30", function () {
        testColumnRange('I', 16, 30);
    });

    it("Numbers in column N are all in range 31-45", function () {
        testColumnRange('N', 31, 45);
    });

    it("Numbers in column G are all in range 46-60", function () {
        testColumnRange('G', 46, 60);
    });

    it("Numbers in column O are all in range 61-75", function () {
        testColumnRange('O', 61, 75);
    });

    function testColumnRange(column, start, end) {
        var card = getCard();
        for (i = 0; i < card.length; i++) {
            if (card[i].substring(0, 1) == column) {
                var n = Number(card[i].substring(1, card[i].length));
                Test.assertEquals(n >= start, true, 'Found: ' + card[i]);
                Test.assertEquals(n <= end, true, 'Found: ' + card[i]);
            }
        }
    }

    function testColumnCount(expected, column) {
        var card = getCard();
        var count = 0;
        for (i = 0; i < card.length; i++) {
            if (card[i].substring(0, 1) == column) {
                count++;
            }
        }
        Test.assertEquals(expected, count);
    }
});
