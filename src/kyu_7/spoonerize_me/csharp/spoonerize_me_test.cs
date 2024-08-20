using NUnit.Framework;

[TestFixture]
public class SpoonerizeTest
{
  [Test]
  public void NitPickingTest()
  {
    Assert.AreEqual("pit nicking", ReadySet.Spoonerize("nit picking"));
  }
  [Test]
  public void WeddingBellsTest()
  {
    Assert.AreEqual("bedding wells", ReadySet.Spoonerize("wedding bells"));
  }
  [Test]
  public void JellyBeansTest()
  {
    Assert.AreEqual("belly jeans", ReadySet.Spoonerize("jelly beans"));
  }
  [Test]
  public void PopCornTest()
  {
    Assert.AreEqual("cop porn", ReadySet.Spoonerize("pop corn"));
  }
}