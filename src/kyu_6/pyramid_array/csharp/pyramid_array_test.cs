namespace Solution {
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class SolutionTest {
    [Test]
    public void BasicTests() {
      Assert.AreEqual(new int[][] {}, Kata.Pyramid(0));
      Assert.AreEqual(new int[][] { new int[] { 1 } }, Kata.Pyramid(1));
      Assert.AreEqual(new int[][] { new int[] { 1 }, new int[] { 1, 1 } }, Kata.Pyramid(2));
      Assert.AreEqual(new int[][] { new int[] { 1 }, new int[] { 1, 1 }, new int[] { 1, 1, 1 } }, Kata.Pyramid(3));
    }
  }
}