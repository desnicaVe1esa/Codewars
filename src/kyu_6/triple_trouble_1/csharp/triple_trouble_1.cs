using System;
using System.Collections.Generic;

public class Kata {
    public static int TripleDouble(long num1, long num2) {
       string n1str = num1.ToString();
        string n2str = num2.ToString();

        for (int i = 0; i < 10; i++)
        {
            string n = i.ToString();
            if (n1str.Contains(n + n + n) && n2str.Contains(n + n))
            {
                return 1;
            }
        }

        return 0;
    }
}