using System.Linq;
using System.Text.RegularExpressions;

public class Solution
{
    public static string[] dup(string[] arr){
        return arr.Select(x => Regex.Replace(x,"(.)\\1+", "$1")).ToArray();
    }
}