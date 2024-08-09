Describe(SequenceSumTest)
{
    It(testBasic)
    {
        SequenceSum seqsum (6);
        Assert::That(seqsum.showSequence(), Equals("0+1+2+3+4+5+6 = 21"));
    }
};