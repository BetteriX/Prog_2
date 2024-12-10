using System;

namespace Mezogazdasagi
{
    internal class Program
    {
        private static Random r = new Random();

        public static void Main(string[] args)
        {
            
            Console.Write("Add meg a búza mennyiségét: ");
            int suly = int.Parse(Console.ReadLine());
            
            int szorzo = r.Next(5, 15 + 1);

            String evFajta = Ev(szorzo);
            Console.WriteLine($"A {suly} tonna: " + evFajta);
        }

        private static string Ev(int num)
        {
            if (num >= 5 && num <= 8)
            {
                return "Átlag allati";
            }
            else if (num >= 9 && num <= 12)
            {
                return "Átlagos év";
            }
            else
            {
                return "Átlag felleti";
            }
        }
    }
}