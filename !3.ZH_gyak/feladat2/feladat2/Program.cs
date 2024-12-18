using System;
using System.IO;

namespace feladat2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Superhero> l = new List<Superhero>();

            try
            {
                using (StreamReader r = new StreamReader("superhero.csv"))
                {
                    string sor;
                    while ((sor = r.ReadLine()) != null)
                    {
                        string[] adatok = sor.Split(";");

                        string nev = adatok[0];
                        List<string> kepessegek = new List<string>();

                        for (int i = 1; i < adatok.Length; i++)
                        {
                            kepessegek.Add(adatok[i].ToLower());
                        }

                        l.Add(new Superhero(nev, kepessegek));
                    }
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }

            l.Sort();
            HashSet<string> kulonbozo = new HashSet<string>();

            foreach (var item in l)
            {
                foreach (var k in item.Kepesegek)
                {
                    kulonbozo.Add(k);
                }
            }

            Console.WriteLine($"Különböző képességek: {kulonbozo.Count}");
        }
    }
}
