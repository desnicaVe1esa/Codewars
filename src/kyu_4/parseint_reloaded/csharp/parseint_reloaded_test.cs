using NUnit.Framework;
public class SolutionTest
{
    [Test]
    public void FixedTests()
    {
        Assert.AreEqual(1, Parser.ParseInt("one"));
        Assert.AreEqual(20, Parser.ParseInt("twenty"));
        Assert.AreEqual(246, Parser.ParseInt("two hundred forty-six"));
    }
}