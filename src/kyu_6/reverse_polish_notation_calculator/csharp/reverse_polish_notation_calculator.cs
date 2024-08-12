using System;
using System.Collections.Generic;

public class Calc
{
  public double evaluate(string expr)
  {
    var ops = new Dictionary<string, Func<double, double, double>>
    {
        { "+", (a, b) => a + b },
        { "-", (a, b) => b - a },
        { "*", (a, b) => a * b },
        { "/", (a, b) => b / a }
    };

    var stack = new Stack<double>();
    stack.Push(0);

    foreach (var s in expr.Split(" ", StringSplitOptions.RemoveEmptyEntries))
    {
        stack.Push(ops.ContainsKey(s) ? ops[s](stack.Pop(), stack.Pop()) : double.Parse(s));
    }

    return stack.Pop();
  }
}