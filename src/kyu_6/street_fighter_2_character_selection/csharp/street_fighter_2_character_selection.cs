using System;
using System.Collections.Generic;
using System.Linq;

public class Kata
{
    public string[] StreetFighterSelection(string[][] fighters, int[] position, string[] moves)
    {
    string[] solution = new string[moves.Length];
    int row = position[0]; int col = position[1];
    for(int i = 0; i < moves.Length; i++){
        switch(moves[i]){
            case "up" :
                row = 0;
                break;
            case "down" :
                row = 1;
                break;
            case "left" :
                col = col == 0 ? 5 : col - 1;
                break;
            case "right" :
                col = col == 5 ? 0 : col + 1;
                break;
        }
        solution[i] = fighters[row][col];
    }
    return solution;
    }
}