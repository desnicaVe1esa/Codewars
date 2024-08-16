Describe(Sample_Tests)
{
    It(Should_work)
    {
        std::string input; std::string expected;
        input = "hey";
        expected = "4433999";
        Assert::That(send_message(input), Equals(expected));

        input = "one two three";
        expected = "666 6633089666084477733 33";
        Assert::That(send_message(input), Equals(expected));

        input = "Hello World!";
        expected = "#44#33555 5556660#9#66677755531111";
        Assert::That(send_message(input), Equals(expected));

        input = "Def Con 1!";
        expected = "#3#33 3330#222#666 6601-1111";
        Assert::That(send_message(input), Equals(expected));

        input = "A-z";
        expected = "#2**#9999";
        Assert::That(send_message(input), Equals(expected));

        input = "1984";
        expected = "1-9-8-4-";
        Assert::That(send_message(input), Equals(expected));

        input = "Big thanks for checking out my kata";
        expected = "#22#444 4084426655777703336667770222443322255444664066688 806999055282";
        Assert::That(send_message(input), Equals(expected));
    }
};