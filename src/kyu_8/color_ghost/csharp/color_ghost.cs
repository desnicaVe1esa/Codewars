using System;

public class Ghost
{
  private static string[] colors = {"white", "yellow", "purple", "red"};
  private string color;

  public Ghost()
  {
    color = colors[new Random().Next(colors.Length)];
  }

  public string GetColor()
  {
    return color;
  }
}