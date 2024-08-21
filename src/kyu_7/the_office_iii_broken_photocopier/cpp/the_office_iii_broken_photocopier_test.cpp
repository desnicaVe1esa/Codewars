Describe(Sample_tests) {
  It(Simple_cases) {
    Assert::That(broken("01"), Equals("10"));

    Assert::That(broken("001111110011001110101111101001"),
                 Equals("110000001100110001010000010110"));

    Assert::That(broken("00110100110010011100110010100111100000011"),
                 Equals("11001011001101100011001101011000011111100"));

    Assert::That(broken("00000011111010001100010101001110"),
                 Equals("11111100000101110011101010110001"));

    Assert::That(broken("0000000000"), Equals("1111111111"));

    Assert::That(broken("1111111111"), Equals("0000000000"));
  }
};