using NUnit.Framework;
using System;
 
[TestFixture]
public class SolutionTest
{
  [Test]
  public void ExampleTests()
  {
    Assert.AreEqual("srawedoc", Solution.solve("codewars"));
    Assert.AreEqual("edoc ruoy", Solution.solve("your code"));     
    Assert.AreEqual("skco redo cruoy", Solution.solve("your code rocks")); 
   
  }
}