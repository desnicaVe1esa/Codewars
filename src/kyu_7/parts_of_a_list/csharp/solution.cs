using System.Linq;
public class PartList
{
    public static string[][] Partlist(string[] arr)
    {
        return Enumerable.Range(1,arr.Length-1)
                         .Select(x=>
                             new string[]{
                                 string.Join(" ",arr.Take(x)),
                                 string.Join(" ",arr.Skip(x).Take(arr.Length-x))
                               })
                         .ToArray();

    }
}