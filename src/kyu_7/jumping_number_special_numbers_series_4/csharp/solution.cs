using System;

class Kata
{
    public static string JumpingNumber(int number)
    {
        if (number <= 9)
        {
            return "Jumping!!";
        }
        string digits = number.ToString();
        for (int i = 0; i < digits.Length; i++)
        {
            if (i < digits.Length - 1)
            {
                if (Math.Abs(digits[i] - digits[i + 1]) != 1)
                {
                    return "Not!!";
                }
            }
        }
        return "Jumping!!";
    }
}