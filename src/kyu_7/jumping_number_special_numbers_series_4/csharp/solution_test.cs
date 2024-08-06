using NUnit.Framework;
[TestFixture]
class Tests
{
    [TestCase(1)]
    [TestCase(7)]
    [TestCase(9)]
    [TestCase(23)]
    [TestCase(32)]
    [TestCase(98)]
    [TestCase(8987)]
    [TestCase(4343456)]
    [TestCase(98789876)]
    public void BasicJumpingNumbers(int number)
    {
        Assert.That(Kata.JumpingNumber(number), Is.EqualTo("Jumping!!"));
    }
    [TestCase(00000079)]
    public void BasicNotNumbers(int number)
    {
        Assert.That(Kata.JumpingNumber(number), Is.EqualTo("Not!!"));
    }
}