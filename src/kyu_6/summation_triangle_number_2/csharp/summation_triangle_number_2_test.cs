namespace Solution
{
    using NUnit.Framework;
    using System;

    [TestFixture]
    public class SolutionTest
    {
        [TestCase(1L, 0)]
        [TestCase(-5L, 1)]
        [TestCase(10L, 2)]
        [TestCase(-18L, 3)]
        [Test(Description = "Small tests")]
        public void FixedTestsSmall(long expected, int n)
        {
            Act(n, expected);
        }

        [TestCase(10251L, 100)]
        [TestCase(251251L, 500)]
        [TestCase(1002501L, 1000)]
        [Test(Description = "Medium tests")]
        public void FixedTestsMedium(long expected, int n)
        {
            Act(n, expected);
        }

        [TestCase(100025001L, 10000)]
        [TestCase(10000250001L, 100000)]
        [TestCase(1000002500001L, 1000000)]
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