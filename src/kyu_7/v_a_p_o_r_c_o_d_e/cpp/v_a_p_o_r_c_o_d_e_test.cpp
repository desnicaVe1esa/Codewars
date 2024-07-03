Describe(Vaporcode){
  It(BasicTests){
    Assert::That(vaporcode("Let's go to the movies"), Equals("L  E  T  '  S  G  O  T  O  T  H  E  M  O  V  I  E  S"));
    Assert::That(vaporcode("Why isn't my code working?"), Equals("W  H  Y  I  S  N  '  T  M  Y  C  O  D  E  W  O  R  K  I  N  G  ?"));
  }
};