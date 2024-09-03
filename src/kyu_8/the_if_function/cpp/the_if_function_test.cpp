bool ran_expected;
void Expected() { ran_expected = true; }
void Unexpected() { ran_expected = false; }

Describe(if_method)
{
    void SetUp()
    {
       ran_expected = false;
    }
    It(should_work_for_true)
    {
      _if(true, Expected, Unexpected);
      Assert::That(ran_expected, Equals(true));
    }
    It(should_work_for_false)
    {
      _if(false, Unexpected, Expected);
      Assert::That(ran_expected, Equals(true));
    }
};