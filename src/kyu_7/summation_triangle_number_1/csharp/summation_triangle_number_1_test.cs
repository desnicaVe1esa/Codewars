namespace Solution
{
    using NUnit.Framework;
    using System;

    [TestFixture]
    public class SolutionTest
    {
        [TestCase(1L, 0)]
        [TestCase(7L, 1)]
        [TestCase(22L, 2)]
        [TestCase(50L, 3)]
        [Test(Description = "Small tests")]
        public void FixedTestsSmall(long expected, int n)
        {
            Act(n, expected);
        }

        [TestCase(691951L, 100)]
        [TestCase(83959751L, 500)]
        [TestCase(669169501L, 1000)]
        [Test(Description = "Medium tests")]
        public void FixedTestsMedium(long expected, int n)
        {
            Act(n, expected);
        }

        [TestCase(666916695001L, 10000)]
        [TestCase(666691666950001L, 100000)]
        [TestCase(666669166669500001L, 1000000)]
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