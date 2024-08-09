using NUnit.Framework;

[TestFixture]
public class Tests
{
  [Test]
  [TestCase(88, ExpectedResult = "Leo finally won the oscar! Leo is happy")]
  public string LeoTest(int oscar)
  {
    return Kata.Leo(oscar);
  }
}