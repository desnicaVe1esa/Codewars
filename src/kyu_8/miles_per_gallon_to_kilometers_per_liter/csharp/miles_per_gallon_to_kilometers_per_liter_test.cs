using NUnit.Framework;

[TestFixture]
public class ConverterTests
{
	[Test]
	public void Basic_Tests()
	{
		Assert.AreEqual(4.25, Kata.Converter(12));
		Assert.AreEqual(8.50, Kata.Converter(24));
		Assert.AreEqual(12.74, Kata.Converter(36));
	}
}