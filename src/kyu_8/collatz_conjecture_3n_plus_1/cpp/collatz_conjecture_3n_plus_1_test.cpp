Describe(Test){
    It(Examples){
	      Assert::That(hotpo(1), Equals(0));
        Assert::That(hotpo(5), Equals(5));
        Assert::That(hotpo(6), Equals(8));
        Assert::That(hotpo(23), Equals(15));
	  }
};