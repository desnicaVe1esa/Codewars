using System;
using NUnit.Framework;

[TestFixture]
public class CodeWarsTest
{
	[Test]
	public void Given123And456Returns579()
	{
		Assert.AreEqual("579",Kata.sumStrings("123","456"));
	}
}