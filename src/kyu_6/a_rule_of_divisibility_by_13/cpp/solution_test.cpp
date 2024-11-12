void testing(long long ans, long long sol)
{
    Assert::That(ans, Equals(sol));
}

Describe(thirt_Tests)
{
    It(Fixed_Tests)
    {
        testing(Thirteen::thirt(8529), 79);
        testing(Thirteen::thirt(85299258), 31);
        testing(Thirteen::thirt(5634), 57);
        testing(Thirteen::thirt(1111111111), 71);
        testing(Thirteen::thirt(987654321), 30);
    }
};


