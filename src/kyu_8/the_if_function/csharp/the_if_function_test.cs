using System;
using NUnit.Framework;

[TestFixture]
public class Tests
{ 
  [Test]
  public void BasicTest()
  {    
    var a = false;
    
    Kata.If(true, () => a = true, () => a = false);
      
    Assert.True(a, "func1 should be called");
  }
}