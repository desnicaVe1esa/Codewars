using namespace std;

void testequal(int ans, int sol) {
    Assert::That(ans, Equals(sol));
}

Describe(evaporator_Tests)
{
    It(test1)
    {
    	testequal(Evaporator::evaporator(10, 10, 10), 22);
    	testequal(Evaporator::evaporator(10, 10, 5), 29);
	}
};