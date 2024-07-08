using System;
using NUnit.Framework;
using System.Collections.Generic;

[TestFixture]
public class Tests
{
  [Test]
  public static void FixedTest()
  {
    List<int> myValues = new List<int>(new int[] { 1 } );
    Assert.AreEqual(myValues, Kata.CreateList(1));
    
    myValues = new List<int>(new int[] { 1, 2 } );
    Assert.AreEqual(myValues, Kata.CreateList(2));
    
    myValues = new List<int>(new int[] { 1, 2, 3, 4, 5, 6 } );
    Assert.AreEqual(myValues, Kata.CreateList(6));
  }
}