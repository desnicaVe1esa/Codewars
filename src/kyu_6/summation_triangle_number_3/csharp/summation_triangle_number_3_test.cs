namespace Solution 
{
    using NUnit.Framework;
    using System;
  
    [TestFixture]
    public class SolutionTest
    {
        [TestCase(1L, 0)]
        [TestCase(-4L, 1)]
        [TestCase(0L, 2)]
        [TestCase(-18L, 3)]
        [TestCase(-9L, 4)]
        [Test(Description = "Small tests")]
        public void FixedTestsSmall(long expected, int n)
        {
            Act(n, expected);
        }
      
        [TestCase(-127449L, 100)]
        [TestCase(-15687249L, 500)]
        [TestCase(-125249499L, 1000)]
        [Test(Description = "Medium tests")]
        public void FixedTestsMedium(long expected, int n)
        {
            Act(n, expected);
        }
      
        [TestCase(-125024994999L, 10000)]
        [TestCase(-125002499949999L, 100000)]
        [TestCase(-125000249999499999L, 1000000)]
        [Test(Description = "Large tests")]
        public void FixedTestsLarge(long expected, int n)
        {
            Act(n, expected);
        }
      
        private static void Act(int n, long expected)
        {
            var actual = Kata.GetSum(n);
            var msg = $"  n = {n}\n";
            Assert.AreEqual(expected, actual, msg);
        }
    }
}