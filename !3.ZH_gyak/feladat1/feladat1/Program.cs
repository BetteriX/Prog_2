using System;
using System.IO;
using System.Linq.Expressions;

namespace feladat1
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

                        for (int i = 1; i < adatok.Length; i++) {
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
            Console.Write("Adj meg egy szuperképességet: ");
            string szuper_kepesseg = Console.ReadLine().ToLower();
            bool volt = false;

            //List<string> nevek = new List<string>();
            foreach(var item in l)
            {
                if (item.Kepesegek.Contains(szuper_kepesseg))
                {
                    //nevek.Add(item.Nev);
                    Console.WriteLine($"{item.Nev} ({item.Kepesegek.Count})");
                    volt = true;
                }
            }

            //l.Select(x => x)
            //    .OrderBy(x => x.Nev)
            //    .Where(x => x.Kepesegek.Contains(szuper_kepesseg))
            //    .ToList()
            //    .ForEach(x => Console.WriteLine($"{x.Nev} ({x.Kepesegek.Count})"));

            if (!volt)
            {
                Console.WriteLine("$");
            }
        }
    }
}
