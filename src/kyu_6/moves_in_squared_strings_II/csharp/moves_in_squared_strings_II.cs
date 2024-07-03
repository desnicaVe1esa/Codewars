using System;
using System.Linq;
public class Opstrings1
{
    public static string Rot(string s) {
        return string.Join("",s.Reverse());
    }
    public static String SelfieAndRot(string s)
    {
        return string.Join("\n",s.Split('\n').Select(x=>x+new string('.',x.Length)).Concat(
        Rot(s).Split('\n').Select(x=>new string('.',x.Length)+x)  ));
    }
   public static string Oper(Func<string,string> fct, string s)
    {
        return fct(s);
    }
}