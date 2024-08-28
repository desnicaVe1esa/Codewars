using NUnit.Framework;
using System;
 
[TestFixture]
public class SolutionTest
{
  [Test]
  public void ExampleTests()
  {
    Assert.AreEqual(new String[]{"codewars","picaniny","hubububo"}, Solution.dup(new String[]{"ccooddddddewwwaaaaarrrrsssss","piccaninny","hubbubbubboo"}));
    Assert.AreEqual(new String[]{"abracadabra","alote","asese"}, Solution.dup(new String[]{"abracadabra","allottee","assessee"}));       
    Assert.AreEqual(new String[]{"keles","kenes"}, Solution.dup(new String[]{"kelless","keenness"}));
   
  }
}