using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

public class Kata
{
  public static string PrintArray(object[] array)
  {
            string result = "";

            for (int i = 0; i < array.Length; i++)
            {
                if (i > 0 && i < array.Length)
                {
                    result += ",";
                }
                if (array[i] is object[])
                {
                    result += PrintArray(array[i] as object[]);
                    continue;
                }
                result += array[i].ToString();
            }

            return result;  }
}