using System;
using System.Collections.Generic;

public class Dinglemouse {

  private static Dictionary<string, string[]> foodChain = new Dictionary<string, string[]>() {
    {"antelope", new string[] {"grass"}},
    {"big-fish", new string[] {"little-fish"}},
    {"bug", new string[] {"leaves"}},
    {"bear", new string[] {"big-fish", "bug", "chicken", "cow", "leaves", "sheep"}},
    {"chicken", new string[] {"bug"}},
    {"cow", new string[] {"grass"}},
    {"fox", new string[] {"chicken", "sheep"}},
    {"giraffe", new string[] {"leaves"}},
    {"lion", new string[] {"antelope", "cow"}},
    {"panda", new string[] {"leaves"}},
    {"sheep", new string[] {"grass"}},
  };

  public static string[] WhoEatsWho(string zoo) {
    if(zoo == "")
      return new string[1]{""};
    List<string> wew = new List<string>(new string[] {zoo});
    List<string> animals = new List<string>(zoo.Split(','));
    int i = 0;
    int eat = -1;
    while(i < animals.Count) {
      eat = Dinglemouse.Eat(i, animals);
      if(eat > -1) {
        wew.Add(animals[i] + " eats " +  animals[eat]);
        animals.RemoveAt(eat);
        i = 0;
      } else {
        i += 1;
      }
    }
    wew.Add(string.Join(",", animals.ToArray()));
    return wew.ToArray();
  }

  private static int Eat(int index, List<string> animals) {
    string animal = animals[index];
    try {
      string[] eats = Dinglemouse.foodChain[animal];
      if(index > 0 && Array.IndexOf(eats, animals[index-1]) > -1)
        return index - 1;
      if(index < animals.Count-1 && Array.IndexOf(eats, animals[index+1]) > -1)
        return index + 1;
    } catch(KeyNotFoundException) {
    }
    return -1;
  }
}