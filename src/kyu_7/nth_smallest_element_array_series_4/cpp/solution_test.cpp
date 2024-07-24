using namespace std ;

using vec =  vector<int> ;

Describe(test_Basic_Values)
{
    It(Check_Positive_Values)
    {
        Assert::That(nthSmallest(vec{3,1,2} ,2), Equals(2));
          Assert::That(nthSmallest(vec{15,20,7,10,4,3} ,3), Equals(7));

    }
    It(Check_Negative_Values)
    {
        Assert::That(nthSmallest(vec{-5,-1,-6,-18} ,4), Equals(-1));
          Assert::That(nthSmallest(vec{-102,-16,-1,-2,-367,-9} ,5), Equals(-2));

    }
        It(Check_Mixed_Values)
    {
        Assert::That(nthSmallest(vec{2,169,13,-5,0,-1} ,4), Equals(2));
            Assert::That(nthSmallest(vec{177,225,243,-169,-12,-5,2,92} ,5), Equals(92));

    }
};