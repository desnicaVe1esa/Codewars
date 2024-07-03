using System;
using System.Collections.Generic;

public class Kata
{
    public static int Number(List<int[]> peopleListInOut)
    {
        int result = 0;
        for (int i = 0; i < peopleListInOut.Count; i++) {
            result += peopleListInOut[i][0] - peopleListInOut[i][1];
        }
        return result;
    }
}