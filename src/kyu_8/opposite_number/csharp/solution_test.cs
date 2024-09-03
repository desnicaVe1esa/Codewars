using NUnit.Framework;

    [TestFixture]
    public class MyTest
    {
        [Test]
        public void Test_1()
        {
            Assert.AreEqual(-1, Kata.Opposite(1));
        }
    }