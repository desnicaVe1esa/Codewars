using System;
using System.Collections.Generic;

public static class Kata
{
  public static List<int> PascalsTriangle(int n) {
     
    List<int> pt = new List<int>();
    
    pt.Add(1);
    for(int i = 1; i < n; i++)
    {
      for(int j = 0; j <= i; j++)
      {
        if(j == 0 || j == i)
          pt.Add(1);
        else
        {
          pt.Add(pt[pt.Count - i] + pt[pt.Count - (i + 1)]);
        }
      }
    }
    
    return pt;
  }
} 