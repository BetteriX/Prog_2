using System;
using System.Data;
using System.IO;

namespace feladat1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // key:value -> város:évek
            Dictionary<string, List<string>> d = new Dictionary<string, List<string>>();

            try
            {
                using (StreamReader r = new StreamReader("input.txt"))
                {
                    string sor;
                    while ((sor = r.ReadLine()) != null)
                    {
                        string[] adatok = sor.Split(":");

                        string ev = adatok[0];
                        string[] varosok = adatok[1].Split(",");

                        foreach (string varos in varosok)
                        {
                            if (!d.ContainsKey(varos))
                            {
                                d[varos] = new List<string>();
                            }
                            
                            d[varos].Add(ev);
                            
                        }
                    }
                }
            }
            catch (Exception ex){
                Console.WriteLine(ex.Message);
            }

            foreach(var item in d.OrderBy(x => x.Key))
            {
                item.Value.Sort();
                Console.WriteLine($"{item.Key}:{String.Join(",",item.Value)}");
            }
        }
    }
}
