using Code;
using NUnit.Framework;

namespace Tests
{
    public class UniqueTestClass
    {
        [Test]
        public void TestHasUniqueChars1() 
        {
            Assert.IsTrue(Unique.HasUniqueChars("abcdef"));
        }

        [Test]
        public void TestHasUniqueChars2()
        {
            Assert.False(Unique.HasUniqueChars("++-"));
        }

        [Test]
        public void TestHasUniqueChars3()
        {
            Assert.False(Unique.HasUniqueChars("  nAa"));
        }
        
        [Test]
        public void TestHasUniqueChars4()
        {
            Assert.False(Unique.HasUniqueChars("aba"));
        }
    }
}
