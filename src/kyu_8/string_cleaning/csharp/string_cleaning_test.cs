namespace Solution {
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class Test
  {
    [Test]
    public void BasicTest()
    {
      Assert.AreEqual("", Kata.StringClean(""));
      Assert.AreEqual("! !", Kata.StringClean("! !"));
      Assert.AreEqual("", Kata.StringClean("1234567890"));
      Assert.AreEqual("Dsa cdsc csa!!! I Am cool!", Kata.StringClean("Dsa32 cdsc34232 csa!!! 1I 4Am cool!"));
      Assert.AreEqual("A A! AAA   JKL@!!!", Kata.StringClean("A1 A1! AAA   3J4K5L@!!!"));
      Assert.AreEqual("Adgre Asad! AAA fvfdvJKL@", Kata.StringClean("Adgre2321 A1sad! A2A3A4 fv3fdv3J544K5L@"));
      Assert.AreEqual("Addsadds A  $$sad! AAAe fKL@ ", Kata.StringClean("Ad2dsad3ds21 A  1$$s122ad! A2A3Ae24 f44K5L@222222 "));
      Assert.AreEqual("Addsadds A  $$sa!d! A!A!Ae$ f## ", Kata.StringClean("33333Ad2dsad3ds21 A3333  1$$s122a!d! A2!A!3Ae$24 f2##222 "));
      Assert.AreEqual("My \"messy\" data issues! Will they ever, ever be solved?", Kata.StringClean("My \"me3ssy\" d8ata issues2! Will1 th4ey ever, e3ver be3 so0lved?"));
      Assert.AreEqual("Why can't we buy the good software? #cheapskates", Kata.StringClean("Wh7y can't we3 bu1y the goo0d software3? #cheapskates3"));
    }
  }
}