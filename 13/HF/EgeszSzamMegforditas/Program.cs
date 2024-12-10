using System;

namespace EgeszSzamMegforditas
{
  internal class Program
  {
    public static int Megfordit(string str)
    { 
        int hossz = str.Length;
        string result = "";
        for (int i = hossz - 1; i >= 0; i--)
        {
            result += str[i];
        }
        
        return int.Parse(result);
    }
    public static void Main(string[] args)
    {
        int egesz = 12568;
        int megfordit = Megfordit(egesz.ToString());
        
        Console.WriteLine(megfordit);
    }
  }
}