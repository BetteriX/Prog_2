using System;
using System.IO;

namespace feladat4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<int> prim_l = new List<int>();
            try
            {
                using(StreamReader r = new StreamReader("primes.php"))
                {
                    string sor;
                    r.ReadLine();
                    while (!(sor = r.ReadLine()).Equals("); ?>"))
                    {
                        string[] adatok = sor.TrimEnd(',').Split("=>");

                        int prim = int.Parse(adatok[1]);

                        prim_l.Add(prim);
                    }
                }
            } catch(Exception e)
            {
                Console.WriteLine(e.Message);
            }

            Console.WriteLine("-> primes.php beolvasva");

            try
            {
                using (StreamWriter sw = new StreamWriter("output.txt"))
                {
                    foreach (int i in prim_l)
                    {
                        if(IsPalindrom(i.ToString()) && IsPrime(i))
                        {
                            sw.WriteLine(i);
                        }
                    }
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }

            Console.WriteLine("-> output.txt létrehozva");
        }
        public static bool IsPalindrom(string num)
        {
            string reverse = "";

            for (int i = num.Length - 1; i >= 0; i--)
            {
                reverse += num[i];
            }

            return num.Equals(reverse);
        }

        public static bool IsPrime(int number)
        {
            for (int i = 2; i < number; i++)
            {
                if (number % i == 0)
                {
                    return false;
                }
            }

            return true;
        }
    }
}
