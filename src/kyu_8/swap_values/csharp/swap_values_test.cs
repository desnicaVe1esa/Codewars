namespace Solution
{
    using NUnit.Framework;

    using System;
    using System.Linq;

    [TestFixture]
    public class Tests
    {
        [Test]
        public void ExampleTest()
        {
            int[] args = new[] { 1, 2 };

            Swapper swapper = new Swapper(args.Cast<object>().ToArray());
            swapper.SwapValues();

            Assert.AreEqual(2, swapper.Arguments[0], "Failed swapping numbers");
            Assert.AreEqual(1, swapper.Arguments[1], "Failed swapping numbers");
        }
    }
}