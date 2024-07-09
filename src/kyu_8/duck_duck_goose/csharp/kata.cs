public class Kata
{
  public static string DuckDuckGoose(Player[] players, int goose)
  {
    int position = goose % players.Length;
    return position == 0 ? players[players.Length - 1].Name: players[position - 1].Name;
  }
}
public class Player
{
  public string Name {get;set;}

  public Player (string name)
  {
	  this.Name = name;
  }
}