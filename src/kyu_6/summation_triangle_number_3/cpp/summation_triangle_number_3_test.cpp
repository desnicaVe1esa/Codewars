void testequal(long ans, long sol){
    Assert::That(ans, Equals(sol));
}
Describe(Example_Tests){
    It(Small_Tests){
        testequal(Triangle::getSum(0), 1);
        testequal(Triangle::getSum(1), -4);
        testequal(Triangle::getSum(2), 0);
        testequal(Triangle::getSum(3), -18);
        testequal(Triangle::getSum(4), -9);
    }
};
